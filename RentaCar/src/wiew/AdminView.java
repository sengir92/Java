package wiew;

import business.BookManager;
import business.BrandManager;
import business.CarManager;
import business.ModelManager;
import core.ComboItem;
import core.Helper;
import entity.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.ArrayList;

public class AdminView extends Layout {
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JScrollPane scl_brand;
    private JTable tbl_brand;
    private JScrollPane scrl_model;
    private JTable tbl_model;
    private JComboBox cmb_s_model_type;
    private JComboBox cmb_s_model_brand;
    private JComboBox cmb_s_model_gear;
    private JComboBox cmb_s_model_fuel;
    private JButton btn_search_model;
    private JButton btn_cncl_model;
    private JTable tbl_car;
    private JScrollPane scl_car;
    private JScrollPane scrl_booking;
    private JTable tbl_booking;
    private JPanel pnl_booking_search;
    private JComboBox cmb_booking_gear;
    private JComboBox cmb_booking_fuel;
    private JComboBox cmb_booking_type;
    private JFormattedTextField fld_fnsh_date;
    private JFormattedTextField fld_strt_date;
    private JButton btn_booking_search;
    private JButton btn_cncl_booking;
    private JComboBox cmb_book_car;
    private JButton btn_book_search;
    private JButton btn_cncl_book;
    private JTable tbl_book;
    private JScrollPane scrl_book;
    private JPanel pnl_book;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private DefaultTableModel tmdl_model = new DefaultTableModel();
    private DefaultTableModel tmdl_car = new DefaultTableModel();
    private DefaultTableModel tmdl_booking = new DefaultTableModel();
    private DefaultTableModel tmdl_book = new DefaultTableModel();
    private BrandManager brandManager;
    private ModelManager modelManager;
    private CarManager carManager;
    private BookManager bookManager;
    private JPopupMenu brand_menu;
    private JPopupMenu model_menu;
    private JPopupMenu car_menu;
    private JPopupMenu book_menu;
    private JPopupMenu booking_menu;
    private Object[] col_model;
    private Object[] col_car;
    private Object[] col_book;

    public AdminView(User user) {
        this.brandManager = new BrandManager();
        this.modelManager = new ModelManager();
        this.carManager = new CarManager();
        this.bookManager = new BookManager();
        this.add(container);
        this.guiInitilaze(1000, 500);
        this.user = user;
        if (this.user == null) {
            dispose();
        }

        this.lbl_welcome.setText("Welcome : " + this.user.getUsername());

        loadComponent();

        loadBrandTable();
        loadBrandComponent();


        loadModelTable(null);
        loadModelComponent();
        loadModelFilter();

        loadCarTable();
        loadCarComponent();

        loadBookingTable(null);
        loadBookingComponent();
        loadBookingFilter();

        loadBookTable(null);
        loaBookComponenet();
        loaBookFilterCar();


    }

    private void loadComponent() {
        this.btn_logout.addActionListener(e -> {
            dispose();
            LoginView loginView = new LoginView();
        });
    }

    private void loadBookTable(ArrayList<Object[]> bookList) {
        col_book = new Object[]{"ID", "Plate", "Brand", "Model Name", "Customer", "Phone Number", "Mail", "C.N", "Start Date", "Finish Date", "Price"};
        if (bookList == null) {
            bookList = this.bookManager.getForTable(col_book.length, this.bookManager.findAll());
        }
        createTable(this.tmdl_book, this.tbl_book, col_book, bookList);
    }

    private void loaBookComponenet() {
        tableRowSelect(this.tbl_book);
        this.book_menu = new JPopupMenu();
        this.book_menu.add("Cancel").addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int selectBooklId = this.getTableSelectionRow(tbl_book, 0);
                if (this.bookManager.delete(selectBooklId)) {
                    Helper.showMsg("done");
                    loadBookTable(null);
                } else {
                    Helper.showMsg("error");
                }

            }
        });
        this.tbl_book.setComponentPopupMenu(book_menu);

        btn_book_search.addActionListener(e -> {
            ComboItem selectedCar = (ComboItem) this.cmb_book_car.getSelectedItem();
            int carId = 0;
            if (selectedCar != null) {
                carId = selectedCar.getKey();
            }

            ArrayList<Book> bookListBySearch = this.bookManager.searchForTable(carId);
            ArrayList<Object[]> bookRowListBySearch = this.bookManager.getForTable(this.col_book.length, bookListBySearch);
            loadBookTable(bookRowListBySearch);

        });

        btn_cncl_book.addActionListener(e -> {
            loaBookFilterCar();
        });
    }


    public void loaBookFilterCar() {
        this.cmb_book_car.removeAllItems();
        for (Car obj : this.carManager.findAll()) {
            this.cmb_book_car.addItem(new ComboItem(obj.getId(), obj.getPlate()));
        }
        this.cmb_book_car.setSelectedItem(null);
    }

    private void loadBookingComponent() {
        tableRowSelect(this.tbl_booking);
        this.booking_menu = new JPopupMenu();
        this.booking_menu.add("Reservation").addActionListener(e -> {
            int selectCarId = this.getTableSelectionRow(this.tbl_booking, 0);
            BookingView bookingView = new BookingView(
                    this.carManager.getById(selectCarId),
                    this.fld_strt_date.getText(),
                    this.fld_fnsh_date.getText()
            );
            bookingView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBookingTable(null);
                    loadBookingFilter();
                    loadBookTable(null);
                }
            });
        });
        this.tbl_booking.setComponentPopupMenu(booking_menu);

        btn_booking_search.addActionListener(e -> {
            ArrayList<Car> carList = this.carManager.serchForBooking(
                    fld_strt_date.getText(),
                    fld_fnsh_date.getText(),
                    (Model.Type) cmb_booking_type.getSelectedItem(),
                    (Model.Gear) cmb_booking_gear.getSelectedItem(),
                    (Model.Fuel) cmb_booking_fuel.getSelectedItem()
            );

            ArrayList<Object[]> carBookingRow = this.carManager.getForTable(this.col_car.length, carList);
            loadBookingTable(carBookingRow);
        });
        btn_cncl_booking.addActionListener(e -> {
            loadBookingFilter();
        });
    }

    private void loadBookingTable(ArrayList<Object[]> carList) {
        Object[] col_booking_list = {"ID", "Brand", "Model Name", "Plate", "Color", "KM", "Year", "Type", "Fuel Type", "Gear"};
        createTable(this.tmdl_booking, this.tbl_booking, col_booking_list, carList);
    }

    public void loadBookingFilter() {
        this.cmb_booking_type.setModel(new DefaultComboBoxModel<>(Model.Type.values()));
        this.cmb_booking_type.setSelectedItem(null);
        this.cmb_booking_gear.setModel(new DefaultComboBoxModel<>(Model.Gear.values()));
        this.cmb_booking_gear.setSelectedItem(null);
        this.cmb_booking_fuel.setModel(new DefaultComboBoxModel<>(Model.Fuel.values()));
        this.cmb_booking_fuel.setSelectedItem(null);

    }

    private void loadModelComponent() {
        tableRowSelect(this.tbl_model);
        this.model_menu = new JPopupMenu();
        this.model_menu.add("New").addActionListener(e -> {
            ModelView modelView = new ModelView(new Model());
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                }
            });
        });
        this.model_menu.add("Update").addActionListener(e -> {
            int selectModelId = this.getTableSelectionRow(tbl_model, 0);
            ModelView modelView = new ModelView(this.modelManager.getById(selectModelId));
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                    loadCarTable();
                    loadBookTable(null);
                }
            });

        });
        this.model_menu.add("Delete").addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int selectModelId = this.getTableSelectionRow(tbl_model, 0);
                if (this.modelManager.delete(selectModelId)) {
                    Helper.showMsg("done");
                    loadModelTable(null);
                    loadCarTable();
                } else {
                    Helper.showMsg("error");
                }
            }

        });
        this.tbl_model.setComponentPopupMenu(model_menu);

        this.btn_search_model.addActionListener(e -> {
            ComboItem selectedBrand = (ComboItem) this.cmb_s_model_brand.getSelectedItem();
            int brandId = 0;
            if (selectedBrand != null) {
                brandId = selectedBrand.getKey();
            }
            ArrayList<Model> modelListBySearch = this.modelManager.searchForTable(
                    brandId,
                    (Model.Fuel) cmb_s_model_fuel.getSelectedItem(),
                    (Model.Gear) cmb_s_model_gear.getSelectedItem(),
                    (Model.Type) cmb_s_model_type.getSelectedItem()
            );
            ArrayList<Object[]> modelRowListBySearch = this.modelManager.getForTable(this.col_model.length, modelListBySearch);
            loadModelTable(modelRowListBySearch);
        });

        this.btn_cncl_model.addActionListener(e -> {
            this.cmb_s_model_type.setSelectedItem(null);
            this.cmb_s_model_gear.setSelectedItem(null);
            this.cmb_s_model_fuel.setSelectedItem(null);
            this.cmb_s_model_brand.setSelectedItem(null);
            loadModelTable(null);
        });
    }

    public void loadModelTable(ArrayList<Object[]> modelList) {
        this.col_model = new Object[]{"Model ID", "Brand", "Model Name", "Type", "Year", "Fuel Type", "Gear"};
        if (modelList == null) {
            modelList = this.modelManager.getForTable(this.col_model.length, this.modelManager.findAll());
        }
        createTable(this.tmdl_model, this.tbl_model, col_model, modelList);
    }

    public void loadBrandComponent() {
        tableRowSelect(this.tbl_brand);
        this.brand_menu = new JPopupMenu();
        this.brand_menu.add("New").addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                }
            });
        });
        this.brand_menu.add("Update").addActionListener(e -> {
            int selectBrandId = this.getTableSelectionRow(tbl_brand, 0);
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                    loadCarTable();
                    loadBookTable(null);
                }
            });
        });
        this.brand_menu.add("Delete").addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int selectBrandId = this.getTableSelectionRow(tbl_brand, 0);
                if (this.brandManager.delete(selectBrandId)) {
                    Helper.showMsg("done");
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                    loadCarTable();
                } else {
                    Helper.showMsg("error");
                }
            }

        });
        this.tbl_brand.setComponentPopupMenu(brand_menu);
    }

    public void loadBrandTable() {
        Object[] col_brand = {"Brand ID", "Brand Name"};
        ArrayList<Object[]> brandList = this.brandManager.getForTable(col_brand.length);
        this.createTable(this.tmdl_brand, this.tbl_brand, col_brand, brandList);
    }

    public void loadCarTable() {
        col_car = new Object[]{"Car ID", "Brand Name", "Model", "Plate", "Color", "KM", "Year", "Car Type", "Fuel Type", "Gear"};
        ArrayList<Object[]> carList = this.carManager.getForTable(col_car.length, this.carManager.findAll());
        this.createTable(this.tmdl_car, this.tbl_car, col_car, carList);

    }

    public void loadCarComponent() {
        tableRowSelect(this.tbl_car);
        this.car_menu = new JPopupMenu();
        this.car_menu.add("New").addActionListener(e -> {
            CarView carView = new CarView(new Car());
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();
                }
            });
        });
        this.car_menu.add("Update").addActionListener(e -> {
            int selectModelId = this.getTableSelectionRow(tbl_car, 0);
            CarView carView = new CarView(this.carManager.getById(selectModelId));
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();
                }
            });
        });
        this.car_menu.add("Delete").addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int selectCarId = this.getTableSelectionRow(tbl_car, 0);
                if (this.carManager.delete(selectCarId)) {
                    Helper.showMsg("done");
                    loadCarTable();
                } else {
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_car.setComponentPopupMenu(car_menu);

    }


    public void loadModelFilter() {
        this.cmb_s_model_type.setModel(new DefaultComboBoxModel<>(Model.Type.values()));
        this.cmb_s_model_type.setSelectedItem(null);
        this.cmb_s_model_gear.setModel(new DefaultComboBoxModel<>(Model.Gear.values()));
        this.cmb_s_model_gear.setSelectedItem(null);
        this.cmb_s_model_fuel.setModel(new DefaultComboBoxModel<>(Model.Fuel.values()));
        this.cmb_s_model_fuel.setSelectedItem(null);
        this.cmb_s_model_brand.removeAllItems();
        loadModelFilterBrand();
    }

    public void loadModelFilterBrand() {
        this.cmb_s_model_brand.removeAllItems();
        for (Brand obj : brandManager.findAll()) {
            this.cmb_s_model_brand.addItem(new ComboItem(obj.getId(), obj.getName()));
        }
        this.cmb_s_model_brand.setSelectedItem(null);
    }

    private void createUIComponents() throws ParseException {
        this.fld_strt_date = new JFormattedTextField(new MaskFormatter("##/##/####"));
        this.fld_strt_date.setText("10/10/2023");
        this.fld_fnsh_date = new JFormattedTextField(new MaskFormatter("##/##/####"));
        this.fld_fnsh_date.setText("16/10/2023");

    }
}

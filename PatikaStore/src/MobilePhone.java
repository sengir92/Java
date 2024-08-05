
import java.util.Scanner;
import java.util.*;

public class MobilePhone extends Product {

    private double batteryPower;
    private String colour;
    private int cameraMp;

    public MobilePhone(int id, String name, double price, String brandName, int memory, double screenSize, int cameraMp, double batteryPower, int ram, String colour) {
        super(id, name, price, brandName, memory, screenSize, ram);
        this.cameraMp = cameraMp;
        this.batteryPower = batteryPower;
        this.colour = colour;
    }

    static Scanner input = new Scanner(System.in);
    static List<MobilePhone> mobilePhoneList = new ArrayList<>();
    // Add elements to arraylist

    static {
        mobilePhoneList.add(new MobilePhone(1, "Samsung Galaxy A51", 3199.0, "Samsung", 128, 6.5, 32, 4000.0, 6, "Black"));
        mobilePhoneList.add(new MobilePhone(2, "iPhone 11 64 GB", 7379.0, "Apple", 64, 6.1, 5, 3046.0, 6, "Blue"));
        mobilePhoneList.add(new MobilePhone(3, "Redmi Note 10 Pro", 4012.0, "Xiaomi", 128, 6.5, 35, 4000.0, 12, "White"));
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCameraMp() {
        return cameraMp;
    }

    public void setCameraMp(int cameraMp) {
        this.cameraMp = cameraMp;
    }

    //Create the print method for mobile phone arraylist

    public static void showMobilePhone() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-10s | %-12s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "Kamera", "Pil", "RAM", "Renk");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone phone : mobilePhoneList) {
            System.out.printf("| %-3s | %-30s | %-10s | %-12s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |\n",
                    phone.getId(), phone.getName(), phone.getPrice(), phone.getBrandName(), phone.getMemory(),
                    phone.getScreenSize(), phone.getCameraMp(), phone.getBatteryPower(), phone.getRam(),
                    phone.getColour());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    //Create method for the show mobile phone operations

    public static void showMobilePhoneMenu() {
        boolean isMobilePhoneMenu = true;
        do {

            System.out.println("Mobile Phone Operations: ");
            System.out.println("1 - Show mobile phone list ");
            System.out.println("2 - Add mobile phone ");
            System.out.println("3 - Delete mobile phone from list by id ");
            System.out.println("4 - Filter and list mobile phone based on their id");
            System.out.println("0 - Exit ");
            System.out.print("Please select your operations: ");

            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    showMobilePhone();
                    break;
                case 2:
                    addMobilePhone();
                    break;
                case 3:
                    deleteMobilePhone();
                    break;
                case 4:
                    System.out.println("Filter and list mobile phone by ID");
                    searchMobilePhoeId();
                    break;
                case 0:
                    System.out.println("Exit from the mobile phone menu !");
                    isMobilePhoneMenu = false;
                    break;
            }


        } while (isMobilePhoneMenu);
    }
    //Create method for add the mobile phone to arraylist
    public static void addMobilePhone() {
        System.out.println("Enter the information of the mobile phone you want to add");
        System.out.print("ID: ");
        int addID = input.nextInt();
        System.out.print("Name: ");
        String addName = input.next();
        System.out.print("Price: ");
        double addPrice = input.nextDouble();
        System.out.print("Brand Name: ");
        String addBrandName = input.next();
        System.out.print("Memory: ");
        int addMemory = input.nextInt();
        System.out.print("Screen size: ");
        double addScreenSize = input.nextDouble();
        System.out.print("Camera Megapixel: ");
        int addCamera = input.nextInt();
        System.out.println("Battery power: ");
        double addBattery = input.nextDouble();
        System.out.print("Ram: ");
        int addRam = input.nextInt();
        System.out.print("Colour:");
        String addColour = input.next();
        mobilePhoneList.add(new MobilePhone(addID,addName,addPrice,addBrandName,addMemory,addScreenSize,addCamera,addBattery,addRam,addColour));
        System.out.println("Mobile phone added");

    }
    //Create method for delete the mobile phone the arraylist
    public static void deleteMobilePhone() {
        System.out.print("Enter of ID of mobile phone you want delete: ");
        int deleteMp = input.nextInt();
        if(deleteMp >0 && deleteMp < mobilePhoneList.size() + 1) {
            mobilePhoneList.remove(deleteMp - 1);
            System.out.println("Mobile phone deleted");
        } else {
            System.out.println("You enter invalid mobile phone id");
        }

    }
    //Create method for search mobeile phone by id at the arraylist
    public static void searchMobilePhoeId() {
        System.out.print("Enter the ID of the mobile phone you want to list: ");
        int searchMp = input.nextInt();
        if(searchMp  >0 && searchMp < mobilePhoneList.size() +1 ) {
            System.out.println("ID: " + mobilePhoneList.get(searchMp - 1).getId() + " " +
                    "Name: " + mobilePhoneList.get(searchMp - 1).getName() + " " +
                    "Price: " + mobilePhoneList.get(searchMp - 1).getPrice() + " " +
                    "Brand Name: " + mobilePhoneList.get(searchMp - 1).getBrandName() + " " +
                    "Memory: " + mobilePhoneList.get(searchMp - 1).getMemory() + " " +
                    "Screen size: " + mobilePhoneList.get(searchMp - 1).getScreenSize() + " " +
                    "Camera Megapixel: " + mobilePhoneList.get(searchMp - 1).getCameraMp() + " " +
                    "Battery Power: " + mobilePhoneList.get(searchMp - 1).getBatteryPower() + " " +
                    "Ram: " + mobilePhoneList.get(searchMp - 1).getRam() + " " +
                    "Colour: " + mobilePhoneList.get(searchMp - 1).getColour() + " ");
        } else {
            System.out.println("You enter invalid id");
        }


    }
}







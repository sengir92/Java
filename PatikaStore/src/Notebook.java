import java.io.PrintStream;
import java.util.*;

public class Notebook extends Product {

    public Notebook(int id, String name, double price, String brandName, int memory, double screenSize, int ram) {
        super(id, name, price, brandName, memory, screenSize, ram);
    }

    static Scanner input = new Scanner(System.in);
    static List<Notebook> notebookList = new ArrayList<>();

    // Add elements to arraylist
    static {
        notebookList.add(new Notebook(1, "Huawei Matebook 14", 7000.0, "Huawei", 512, 14.0, 16));
        notebookList.add(new Notebook(2, "Lenovo V14 IGL", 3699.0, "Lenovo", 1024, 14.0, 8));
        notebookList.add(new Notebook(3, "Asus Tuf Gaming", 8199.0, "Asus", 2048, 15.6, 32));
    }

    //Create the print method for notebook arraylist
    public static void showNotebook() {

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-20s | %-10s | %-9s | %-9s | %-9s | %-12s |\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebookList) {
            System.out.printf("| %-2d| %-20s | %-9.2fTL | %-9s| %-9d | %-9.1f | %-12d |\n",
                    notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getBrandName(),
                    notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.println("--------------------------------------------------------------------------------------------");

    }

    //Create method for the show notebook operations
    public static void showNotebookMenu() {
        boolean isNotebookMenu = true;
        do {

            System.out.println("Notebook Operations: ");
            System.out.println("1 - Show notebook List ");
            System.out.println("2 - Add notebook ");
            System.out.println("3 - Delete notebook from list by id ");
            System.out.println("4 - Filter and list notebooks based on their id");
            System.out.println("0 - Exit ");
            System.out.print("Please select your operations: ");

            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    showNotebook();
                    break;
                case 2:
                    addNotebook();
                    break;
                case 3:
                    deleteNotebook();
                    break;
                case 4:
                    System.out.println("Filter and list notebooks by ID");
                    searchNotebookId();
                    break;
                case 0:
                    System.out.println("Exit from the notebook menu !");
                    isNotebookMenu = false;
                    break;
            }


        } while (isNotebookMenu);
    }

    //Create method for add the notebook to arraylist
    public static void addNotebook() {
        System.out.println("Enter the information of the laptop you want to add");
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
        System.out.print("Ram: ");
        int addRam = input.nextInt();
        notebookList.add(new Notebook(addID,addName,addPrice,addBrandName,addMemory,addScreenSize,addRam));
        System.out.println("Notebook added");

    }

    //Create method for delete the notebook the arraylist
    public static void deleteNotebook() {
        System.out.print("Enter the ID of the notebook you want delete: ");
        int deleteNotebook = input.nextInt();
        if(deleteNotebook >0 && deleteNotebook < notebookList.size() +1 ) {
            notebookList.remove(deleteNotebook - 1);
            System.out.println("Notebook deleted");
        } else {
            System.out.println("You enter invalid id");
        }
    }

    //Create method for search notebook by id at the arraylist
    public static void searchNotebookId() {
        System.out.print("Enter the ID of the notebook you want to list: ");
        int searchNotebook = input.nextInt();
        if(searchNotebook >0 && searchNotebook < notebookList.size() +1 ) {
            System.out.println("ID: " + notebookList.get(searchNotebook - 1).getId() + " " +
                    "Name: " + notebookList.get(searchNotebook - 1).getName() + " " +
                    "Price: " + notebookList.get(searchNotebook - 1).getPrice() + " " +
                    "Brand Name: " + notebookList.get(searchNotebook - 1).getBrandName() + " " +
                    "Memory: " + notebookList.get(searchNotebook - 1).getMemory() + " " +
                    "Screen size:  " + notebookList.get(searchNotebook - 1).getScreenSize() + " " +
                    "Ram: " + notebookList.get(searchNotebook - 1).getRam() + " ");
        } else {
            System.out.println("You enter invalid id");
        }

    }


    }


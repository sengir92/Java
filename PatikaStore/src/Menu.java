import java.util.Scanner;

public class Menu {

// Create show method for doing operations and show brands
    public static void Show() {
        boolean isMenu = true;
        Scanner input = new Scanner(System.in);

        //Create do-while loop for the menu
        do {

            System.out.println("Welcome to the Patika Store  ");
            System.out.println("1 - Notebook Operations ");
            System.out.println("2 - Mobile Phone Operations ");
            System.out.println("3 - Brands ");
            System.out.println("0 - Exit ");
            System.out.print("Please select your operations: ");

            int selection = input.nextInt();
            switch (selection) {
                case 1:
                    Notebook.showNotebookMenu();
                    break;
                case 2:
                    System.out.println("Mobile Phone");
                    MobilePhone.showMobilePhoneMenu();
                    break;
                case 3:
                    System.out.println("Brands");
                    System.out.println("----------");
                    Brand.BrandList();
                    break;
                case 0:
                    System.out.println("Thank you for choosing us. See you again !");
                    isMenu = false;
                    break;
            }


        } while (isMenu);

    }

}
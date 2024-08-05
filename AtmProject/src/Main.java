import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName,passWord;
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while(right > 0) {
            System.out.print("Username: ");
            userName = inp.nextLine();
            System.out.print("Password: ");
            passWord = inp.nextLine();
            if ((userName.equals("patika")) && (passWord.equals("dev123"))) {
                System.out.println("Hello, welcome X Bank");
                do {

                    System.out.println("Please select the action");
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Querry balance\n" +
                            "4- Exit");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Money amount: ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("New amount:" + balance);
                            break;
                        case 2:
                            System.out.print("Money amount: ");
                            price = inp.nextInt();
                            if (balance >= price) {
                                balance -= price;
                                System.out.println("New amount: " +balance);
                            } else {
                                System.out.println("Insufficent funds");
                            }
                            break;
                        case 3:
                            System.out.println("Your amount: " + balance);
                            break;
                        case 4:
                            System.out.print("See you again");
                            break;
                    }
                } while (select != 4);

                break;

            } else {
                System.out.println("Wrong username or password.Try again");
                System.out.println("Remaining right: " + --right);
            }


        }

    }
}
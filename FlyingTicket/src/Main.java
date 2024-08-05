import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Get data from user using scanner class
        Scanner input = new Scanner(System.in);

        //define variables
        int km, age, tType;
        double kmPrice= 0.1, discount = 0,price;
        System.out.print("Enter the distance in km: ");
        km = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter trip type (1-one direction 2-round trip) : ");
        tType = input.nextInt();

        //check for incorrect data entry
        if (km <= 0 || age <= 0 || (tType != 1 && tType !=2)) {
            System.out.println("You entered incorrect data!");
        } else {

            // discount for age
            price = km * kmPrice;
            if (age < 12) {
                discount = 0.5;
                price = price *discount;
            } else if (age >= 12 && age <= 24) {
                discount = 0.9;
                price = price*discount;
            } else if (age >= 65) {
                discount = 0.7;
                price = price *discount;
                System.out.println(price);
            }

            //discount for trip type
            if (tType ==1) {
                System.out.println("Total price: " + price);
            } else if (tType == 2) {
                price = price *0.8;
                price = price * 2;
                System.out.println("Total price: " + price);
            }


        }


    }
}
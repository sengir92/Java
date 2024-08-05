import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Get data from user with Scanner class
        Scanner inp = new Scanner(System.in);

        //Define variables
        System.out.print("Enter number: ");
        int number = inp.nextInt();
        int sum = 0;

        //For loop created to find numbers divisors
        for(int i = 1; i <= number; i++) {
            if ((number % i == 0) && (i != number)) {
                sum += i;
            }

        }
        //Number perfection check
        if(sum == number) {
            System.out.println(number + " is perfect number");
        } else  {
            System.out.println(number + " isn't perfect number");
        }


    }
}
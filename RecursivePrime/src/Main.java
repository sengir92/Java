import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // define boolean class for prime situation
    static boolean isPrime(int number,int divisor) {
        // if divisor 1 number is a prime number
        if (divisor == 1) {
            return true;
        // If a number is divided by a divisor and its mode is equal to 0, the number is not prime.
        } else if ((number % divisor) == 0) {
            return false;
        }
        // run the method recursively
        return isPrime(number,(divisor - 1));

    }

    public static void main(String[] args) {
        //get data from user with Scanner class
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = inp.nextInt();
        //create an if condition for the primality of the number
        if(isPrime(number,(number / 2))) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is a not prime number");
        }
    }
}
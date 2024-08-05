import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Prime numbers (1-100): ");
        // for loop to find prime numbers
        for(int i = 2; i <= 100; i++) {
        // create booelan to check prime numbers
            boolean prime = true;
            //another for loop divisor numbers
            for(int j = 2; j < i; j++) {
                //check the statement
                if(i % j == 0) {
                    // if our boolean turn to false break the loop
                    prime = false;
                    break;
                }
            }
            // if our boolean not turn to false print the prime numbers
            if(prime) {
                System.out.print(i + "-");
            }
        }





    }
}
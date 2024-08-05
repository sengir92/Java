import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // define new class
    static int power(int base,int exponent ) {
        //if the exponent is 0,the result will be 1
        if(exponent == 0) {
            return 1;
        } else {
        //if exponent isn't 0,do the operation with recursive method
           return base * power(base,(exponent-1));

        }
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        // get data from user with Scanner class
        System.out.print("Enter base number: ");
        int baseNumber = inp.nextInt();
        System.out.print("Enter exponent number: ");
        int expNumber = inp.nextInt();

        // print the result
        System.out.print("Result: " +power(baseNumber,expNumber));



    }
}
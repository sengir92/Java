import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // get data from user with Scanner class
        Scanner inp = new Scanner(System.in);

        //define variable
        System.out.print("Enter integer: ");
        int intNumber = inp.nextInt();
        // convert integer to double
        double x = intNumber;
        System.out.println(x);

        System.out.print("Enter double: ");
        double doubleNumber = inp.nextDouble();
        //convert double to integer
        int y = (int) doubleNumber;
        System.out.println(y);






    }
}
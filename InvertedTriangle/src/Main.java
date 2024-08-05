import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // get data from user with Scanner class
        Scanner inp = new Scanner(System.in);

        //define variables
        System.out.print("Number of digit: ");
        int n = inp.nextInt();

        //for loop to draw inverted triangle with stars
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
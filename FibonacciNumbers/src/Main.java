import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // get data from user with Scanner class
        Scanner inp = new Scanner(System.in);

        //Define variable
        System.out.print("Enter the number of elements in the fibonacci serial: ");
        int n= inp.nextInt();
        int a = 0, b = 1;

        //create for loop to find fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }




    }
}
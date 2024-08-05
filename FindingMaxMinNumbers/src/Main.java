import java.util.Scanner;
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Get data from user with Scanner class
        Scanner inp = new Scanner(System.in);

        // Define variable
        int n;
        System.out.print("How many numbers will you enter: ");
        n = inp.nextInt();
        //Define max and min value
        int max = 0, min = 0;
        //Creating a loop for the user to enter as many numbers as they want
        for(int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int k = inp.nextInt();
        //compare number that user entered with max and min value
            if (k < min) {
                min = k;
            } else if (k > max) {
                max = k;
                }
        }
        //print the max and min values
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);






    }
}
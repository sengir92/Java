import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = inp.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            int n = inp.nextInt();
            array[i] = n;


        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
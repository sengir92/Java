import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);


        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();

        int min = list[0];
        int max = list[list.length - 1];

        for (int i : list) {
            if (i < number && i > min) {
                min = i;
            }
            if (i > number && i < max) {
                max = i;
            }
        }
        System.out.println("Nearest number less than the entered number : " + min);
        System.out.println("Nearest number greater than the entered number : " + max);


    }
}
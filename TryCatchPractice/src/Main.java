import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define an array with 10 elements
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Enter index number: ");

        // input index number from user
        int indexNo = input.nextInt();

        //try/catch method. If user enters bigger number than the length of the array, the reason for the exception will be shown
        try {
            int check = checkIndexElement(array, indexNo);
            System.out.println(check);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    // method that return the entered index number in the array
    public static int checkIndexElement(int[] arr, int indexNumber) {
        return arr[indexNumber];
    }


}
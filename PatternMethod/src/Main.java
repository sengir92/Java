import java.util.Scanner;

public class Main{

    //define 3 variables class
    public static int pattern(int a, int b, boolean isDecreasing) {
        // if a greater than 0 and decraseing
        if ((a > 0) && isDecreasing) {
            System.out.print(a + " ");
            pattern(a-5, b ,true);
            // if a less than 0 increasing
        } else {
            if (a <= b) {
                System.out.print(a + " ");
                pattern(a+5,b,false);
            }
        } return a;
    }

    public static void main(String[] args) {
        // get data from user with Scanner class
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number: ");
        //define number
        int number = inp.nextInt();
        pattern(number,number,true);


    }
}






import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       // define variables
        int a,b,c,result;

        // get numbers from user
        System.out.print("First number: ");
        a = inp.nextInt();
        System.out.print("Second number: ");
        b = inp.nextInt();
        System.out.print("Third number: ");
        c = inp.nextInt();

        //find the result
        result = a+b*c-b;
        System.out.println(result);


    }
}
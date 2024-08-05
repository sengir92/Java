import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int total = 0;

        do {
             System.out.print("Enter number: ");
             n = inp.nextInt();
             if (n % 4 == 0) {
                 total +=n;

             }
        }while ((n % 2) != 1);

        System.out.println(total);
//


       /* do {
            System.out.print("Enter number: ");
            n = inp.nextInt();
            if (n % 2 ==1) {
                total +=n;
            }
        } while (n > 0);
        System.out.println(total);
        */




    }
}


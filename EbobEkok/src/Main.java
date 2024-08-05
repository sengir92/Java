import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n1: ");
        int n1 = inp.nextInt();
        System.out.print("Enter n2:");
        int n2 = inp.nextInt();
        int ebob = 1;
        int ekok = 1;


        int i = 1;
        while (i <= n1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
            }
            i++;

        }
        System.out.println("Ebob: " + ebob);

        while (i <= (n1 * n2)) {
            ekok = (n1*n2) / ebob;
            System.out.println("Ekok: " +ekok);
            break;

        }


    }
}








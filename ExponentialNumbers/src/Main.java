import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,k;
        System.out.print("Number to be exponent: ");
        n = inp.nextInt();
        System.out.print("Number to upper: " );
        k= inp.nextInt();
        int total= 1;

        for(int i= 1;i <= k; i++) {
            total *=n;
        }    System.out.print(total);





    }
    }

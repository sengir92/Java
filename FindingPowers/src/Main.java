import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Enter the number:");
        n = inp.nextInt();

        for(int i = 1; i<=n;i*=5) {
            System.out.println(i);
        }
        for(int j = 1; j<=n; j *=4) {
            System.out.println(j);
        }



        }
    }

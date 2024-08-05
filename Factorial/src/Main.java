import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n= inp.nextInt();
        System.out.print("Enter second number: ");
        int r= inp.nextInt();
        int totalN = 1;
        int totalJ = 1;
        double comb;
        int totalC = 1;
        int c = n-r;

        for(int i=1; i <= n; i++) {
            totalN = totalN * i;
        }
        System.out.println(totalN);
        for (int j =1; j <= r; j++) {
            totalJ = totalJ *j;
        }
        System.out.println(totalJ);
        for (int k =1; k <=c; k++ ) {
            totalC =totalC * c;
        } System.out.println(totalC);
        comb = totalN / (totalJ * totalC);
        System.out.println(comb);




    }
}
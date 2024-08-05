import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n;
        System.out.print("Enter number: ");
        n = inp.nextInt();
        double result=0;

        for(double i=1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
        }
}
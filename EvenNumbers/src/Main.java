
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double average=0;
        int k,total=0,loop=0;
        System.out.print("Enter the number: ");
        k=inp.nextInt();

        for(int i = 0; i<=k; i++) {
            if(i % 12 == 0 ) {
                i = i + 0;
                loop++;
                total += i;

            }
        }
        average = total /loop;
        System.out.println(average);
    }

}
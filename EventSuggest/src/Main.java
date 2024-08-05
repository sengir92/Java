import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int temp;

        System.out.print("Enter the temperature: ");
        temp = inp.nextInt();

        if (temp < 5) {
            System.out.println("You can go skiing");
        } else if (temp > 5 && temp < 25) {
            if(temp <=15) {
                System.out.println("Yo can go to cinema");
            }
            if (temp >= 15) {
                System.out.println("You can go on a picnic");
            }
        } else {
            System.out.println("You can go swimming");

        }

    }
}
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Enter number: ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter number between 0-100");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Your next incorrect entry will be decrease your right");
                } else {
                    System.out.println("So many wrong entry!Your remaning rights: " + (5 - (++right)));
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Congrats,correct guess ! Your guessing number: " + number);
                isWin = true;
                break;
            } else {

                System.out.println("You enter wrong number !");
                if (selected > number) {
                    System.out.println(selected + " is higher than secret number");
                } else {
                    System.out.println(selected + " is smaller than secret number");
                }
                wrong[right++] = selected;
                System.out.println("Your remaining right: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost !");
            if (!isWrong) {
                System.out.println("Numbers you guessed : " + Arrays.toString(wrong));
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        // definition variables
        int birth;

        //get birthyear from user
        System.out.print("Give the birthyear: ");
        birth = inp.nextInt();

        //find user horoscope
        switch (birth % 12) {
            case 0 :
                System.out.println("Your horoscope is monkey");
                break;
            case 1 :
                System.out.println("Your horoscope is cockerel");
                break;
            case 2 :
                System.out.println("Your horoscope is dog");
                break;
            case 3 :
                System.out.println("Your horoscope is pig");
                break;
            case 4 :
                System.out.println("Your horoscope is mouse");
                break;
            case 5 :
                System.out.println("Your horoscope is ox");
                break;
            case 6 :
                System.out.println("Your horoscope is tiger");
                break;
            case 7 :
                System.out.println("Your horoscope is rabbit");
                break;
            case 8 :
                System.out.println("Your horoscope is dragon");
                break;
            case 9 :
                System.out.println("Your horoscope is snake");
                break;
            case 10 :
                System.out.println("Your horoscope is horse");
                break;
            case 11 :
                System.out.println("Your horoscope is sheep");
                break;
        }




    }
}
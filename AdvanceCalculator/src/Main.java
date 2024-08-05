import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    static int minus(int a, int b) {
        int result = a - b;
        return result;
    }
    static int times(int a, int b) {
        int result = a * b;
        return  result;
    }
    static int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Second number not equals 0");
            return 0;
        }
        int result = a / b;
        return  result;
    }
    static int power(int a, int b) {
        int result = 1;
        for(int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    static int factorial(int a) {
        int result =1;
        for(int i =1; i <= a; i++ ) {
            result = result * i;
        }
        return result;
    }
    static  int mod(int a,int b) {
        return  a %b;
    }
    static  void rectangle(int a, int b) {
        System.out.println("Perimeter: " + (2 * (a+b)));
        System.out.println("Area: " + (a*b));
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int select;

        String menu = "1-Addition \n" +
                "2-Substraction \n" +
                "3-Multiplication \n" +
                "4- Division \n" +
                "5- Exponential number calculation \n" +
                "6- Factorial Calculation \n" +
                "7- Mod \n" +
                "8- Rectangle area and perimeter calculation\n" +
                "0 - Exit the program";


        System.out.println(menu);
        while (true) {
            System.out.print("Please choose operation: ");
            select = inp.nextInt();

            if (select == 0) {
                break;
            }
            System.out.print("First Number: ");
            int a = inp.nextInt();
            System.out.print("Second Number: ");
            int b = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Sum: " + sum(a,b));
                    break;
                case 2:
                    System.out.println("Sub: " +minus(a,b));
                    break;
                case 3:
                    System.out.println("Multiply: " + times(a,b));
                    break;
                case 4:
                    System.out.println("Divided: " +divide(a,b));;
                    break;
                case 5:
                    System.out.println("Base calculation: " + power(a,b));
                    break;
                case 6:
                    System.out.println("Factorial: " + factorial(a));
                    break;
                case 7:
                    System.out.println("Mod: " + mod(a,b));
                    break;
                case 8:
                    rectangle(a,b);
                    break;

                default:
                    System.out.println("You entered an invalid transaction\n");
            }

        }
        System.out.println("See you again");

    }
}
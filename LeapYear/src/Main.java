import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Getting data from user using Scanner class
        Scanner inp =new Scanner(System.in);

        //define variables
        int year;

        //getting year from user
        System.out.print("Enter year: ");
        year = inp.nextInt();

        //calculate leap year
        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if ((year % 4 == 0) && (year % 100 !=0)) {
                System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }






    }
}
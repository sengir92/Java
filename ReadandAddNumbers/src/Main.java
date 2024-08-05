import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            //Define objects to read numbers from file
            FileReader readFile = new FileReader("Numbers.txt");
            BufferedReader readBuff = new BufferedReader(readFile);

            //Define variables
            String line = readBuff.readLine();
            int sum = 0;

            //While loop for read numbers and sum up the numbers
            while (line != null) {
                int number = Integer.parseInt(line);
                sum += number;

                System.out.println(line);
                line = readBuff.readLine();
            }
            //Write the sum
            System.out.println("Sum :" + sum);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
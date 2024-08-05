import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        //Define new object for get data from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();

        //To write the file to text
        try {
            FileWriter fileWriter = new FileWriter("notepad.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //To read the text from file
        try {
            FileReader fileReader = new FileReader("notepad.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
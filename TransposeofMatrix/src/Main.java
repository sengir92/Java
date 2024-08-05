import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        // user determine the dimensions of the matrix
        System.out.print("Enter number of rows of matrix: ");
        int rowNumber = inp.nextInt();
        System.out.print("Enter number of column of matrix: ");
        int columnNumber = inp.nextInt();

        // define new matrix
        int[][] matrix = new int[rowNumber][columnNumber];

        //Get elements of the matrix from user
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter number: ");
                int n = inp.nextInt();
                matrix[i][j] = n;
            }
        }

        //Print the matrix
        System.out.println("Matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "   ");
            }
            System.out.println();
        }

        //Define the new transpose matrix
        int[][] tMatrix = new int[columnNumber][rowNumber];

        //Transpoze the matrix received from user
        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[i].length; j++) {
                tMatrix[i][j] = matrix[j][i];
            }
        }

        //Print the transpoze of matrix
        System.out.println("Transpoze: ");
        for (int row = 0; row < tMatrix.length; row++) {
            for (int column = 0; column < tMatrix[row].length; column++) {
                System.out.print(tMatrix[row][column] + "   ");
            }
            System.out.println();
        }

    }
}


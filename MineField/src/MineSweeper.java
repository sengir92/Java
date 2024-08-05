import java.util.Scanner;
import java.util.Random;


public class MineSweeper {
    int rowNumber;
    int colNumber;
    int size;
    String[][] board;
    String[][] map;
    boolean game = true;

    Scanner inp = new Scanner(System.in);
    Random rand = new Random();


    MineSweeper() {
        this.isValidDimensions();
        this.size = rowNumber * colNumber;
        this.board = new String[rowNumber][colNumber];
        this.map = new String[rowNumber][colNumber];

    }

    //Create this method to check if user entered valid dimensions and entered values are valid create the game map and board size  "Değerlendirme formu 7"

    void isValidDimensions() {
        do {
            System.out.print("Enter row number: ");
            this.rowNumber = inp.nextInt();
            System.out.print("Enter column number: ");
            this.colNumber = inp.nextInt();
            if (rowNumber < 2 || colNumber < 2) {
                System.out.print("You enter invalid dimensions! Please enter valid dimensions.");
                System.out.println();
            }
        } while (rowNumber < 2 || colNumber < 2);

    }


    //Create run method for the game to be played and concluded "Değerlendirme formu 6"

    public void run() {
        System.out.println("Welcome the minesweeper game ");
        mining();
        System.out.println("Your map: ");
        print(map);
        System.out.println("Your board: ");
        int rowC, colC;
        int select = 0;
        boolean[][] selectedC = new boolean[rowNumber][colNumber];

        //Update the minefield every time the user select the point "Değerlendirme formu 11"

        while (game) {
            print(board);

            //Getting the row and column info the user wants to choose "Değerlendirme formu 9"

            System.out.print("Enter row coordinate: ");
            rowC = inp.nextInt();
            System.out.print("Enter col coordinate: ");
            colC = inp.nextInt();

            //Check the point select by user in the matrix and if point isnt in the matrix the user warned and asked to select again "Değerlendirme formu 10"

            if (rowC < 0 || rowC >= rowNumber) {
                System.out.println("Enter wrong coordinate. Please enter right coordinate !");
                continue;
            }
            if (colC < 0 || colC >= colNumber) {
                System.out.println("Enter wrong coordinate. Please enter right coordinate !");
                continue;
            }


            if (!map[rowC][colC].equals(" * ")) {

                //Keep the points chosen by user in a boolean matrix
                if (!selectedC[rowC][colC]) {
                    selectedC[rowC][colC] = true;
                    checkMine(rowC, colC);
                    select++;

                    //Control to win the game if all points are selected without mines "Değerlendirme formu 14-15"

                    if (select == (size - (size / 4))) {
                        System.out.println("Congratulations! You avoided all mines. You won!");
                        break;
                    }
                } else {
                    //Warning if the user selects thesame point
                    System.out.println("You have entered this coordinate before. Please try another coordinate!");

                }

            } else {
                //Control in such a way that the user loses the game when user hit the mine "Değerlendirme formu 13 -15 "
                game = false;
                System.out.print("Sorry. You hit a mine! Game over! ");
            }

        }


    }

    //Randomly place mines in the matrix we created "Değerlendirme formu 8"

    public void mining() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " - ";
            }
        }
        for (int a = 0; a < map.length; a++) {
            for (int b = 0; b < map[a].length; b++) {
                map[a][b] = " - ";
            }
        }
        int randR, randC, count = 0;
        while (count != (size / 4)) {
            randR = rand.nextInt(rowNumber);
            randC = rand.nextInt(colNumber);
            if (!map[randR][randC].equals(" * ")) {
                map[randR][randC] = " * ";
                count++;
            }

        }
    }

    //checkMine method allows calculating the number of mines around the entered point if there are no mines "Değerlendirme formu 12"

    public void checkMine(int r, int c) {
        int mineNumber = 0;
        if ((r - 1 >= 0) && (c - 1 >= 0) && (map[r - 1][c - 1].equals(" * "))) {
            mineNumber++;
        }
        if ((r >= 0) && (c - 1 >= 0) && (map[r][c - 1].equals(" * "))) {
            mineNumber++;
        }
        if ((r < rowNumber - 1) && (c - 1 >= 0) && (map[r + 1][c - 1].equals(" * "))) {
            mineNumber++;
        }
        if ((r - 1 >= 0) && (c >= 0) && (map[r - 1][c].equals(" * "))) {
            mineNumber++;
        }
        if ((r < rowNumber - 1) && (map[r + 1][c].equals(" * "))) {
            mineNumber++;
        }
        if ((r - 1 >= 0) && (c < colNumber - 1) && (map[r - 1][c + 1].equals(" * "))) {
            mineNumber++;
        }
        if ((r >= 0) && (c < colNumber - 1) && (map[r][c + 1].equals(" * "))) {
            mineNumber++;
        }
        if ((r < rowNumber - 1) && (c < rowNumber - 1) && (map[r + 1][c + 1].equals(" * "))) {
            mineNumber++;
        }
        board[r][c] = String.valueOf(mineNumber);


    }

    public void print(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
    }


}














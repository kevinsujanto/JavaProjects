import java.util.*;

public class SudokuSolver {
    private static final int SIZE = 9;
    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args)
    {

        int[][] empty_board = {
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
//              -   -   -   -   -   -   -   -   -
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
//              -   -   -   -   -   -   -   -   -
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
                {0, 0, 0,   0, 0, 0,    0, 0, 0},
        };

        int[][] board = {
                {5, 3, 0,   0, 7, 0,    0, 0, 0},
                {6, 0, 0,   1, 9, 5,    0, 0, 0},
                {0, 9, 8,   0, 0, 0,    0, 6, 0},
//              -   -   -   -   -   -   -   -   -
                {8, 0, 0,   0, 6, 0,    0, 0, 3},
                {4, 0, 0,   8, 0, 3,    0, 0, 1},
                {7, 0, 0,   0, 2, 0,    0, 0, 6},
//              -   -   -   -   -   -   -   -   -
                {0, 6, 0,   0, 0, 0,    2, 8, 0},
                {0, 0, 0,   4, 1, 9,    0, 0, 5},
                {0, 0, 0,   0, 8, 0,    0, 7, 9},
        };

        System.out.println("Welcome to Sudoku Solver!");

        String[] inputStr = new String[SIZE];
        if(args.length == SIZE)
        {
            for(int i = 0; i < SIZE; i++) {
                inputStr[i] = args[i];
            }
            for(int i = 0; i < SIZE; i++)
            {
                for(int j = 0; j < SIZE; j++)
                {
                    if(inputStr.length == SIZE && inputStr[i].length() == SIZE)
                        empty_board[i/3*3 + j/3][(i*3)%9 + j%3] = inputStr[i].charAt(j) - '0';
                }
            }
            System.out.println("Sudoku Input: ");
            printSudoku(empty_board);
            System.out.println("\nSudoku Solved: ");
            long startTime = System.nanoTime();
            sudokuSolver(empty_board, 0,0);
            long endTime = System.nanoTime();
            long totalTime = (endTime - startTime);
            System.out.println("Input was done on script!");
            System.out.println("Solved sudoku in " + totalTime + " nanoseconds" + " (" + ((double) (totalTime / 100000) / 10000 + " seconds)"));
        }
        else
        {
            System.out.println("There are 9 3x3 Boxes in Sudoku             Each Box has 9 numbers");
            System.out.println(ANSI_BLUE + " Box 1   |   Box 2   |   Box 3           Number 1 | Number 2 | Number 3");
            System.out.println(" - - - - - - - - - - - - - - - -         - - - - - - - - - - - - - - - -");
            System.out.println(" Box 4   |   Box 5   |   Box 6           Number 4 | Number 5 | Number 6");
            System.out.println(" - - - - - - - - - - - - - - - -         - - - - - - - - - - - - - - - -");
            System.out.println(" Box 7   |   Box 8   |   Box 9           Number 7 | Number 8 | Number 9" + ANSI_RESET);
            System.out.println();

            Scanner sc = new Scanner(System.in);
            String[] inputList = new String[SIZE];
            for(int i = 0; i < SIZE; i++)
                inputList[i] = "";
            long startInput = System.nanoTime();
            for(int i = 0; i < SIZE; i++) {
                System.out.println("Enter the 9 numbers for " + ANSI_RED + "BOX " + (i + 1) + ":" + ANSI_RESET);
                if(sc.hasNextLine())
                    inputList[i] = (sc.nextLine());
            }
            long endInput = System.nanoTime();
            for(int i = 0; i < SIZE; i++)
            {
                for(int j = 0; j < SIZE; j++)
                {
                    if(inputList.length == SIZE && inputList[i].length() == SIZE)
                        empty_board[i/3*3 + j/3][(i*3)%9 + j%3] = inputList[i].charAt(j) - '0';
                }
            }

            System.out.println("Sudoku Input: ");
            printSudoku(empty_board);
            System.out.println("\nSudoku Solved: ");
            long startTime = System.nanoTime();
            sudokuSolver(empty_board, 0,0);
            long endTime = System.nanoTime();
            long totalTime = (endTime - startTime);
            long inputTime = endInput - startInput;

            System.out.println("\nInput took: " + ((double) (inputTime / 100000) / 10000 + " seconds"));
            System.out.println("Solved sudoku in " + totalTime + " nanoseconds" + " (" + ((double) (totalTime / 100000) / 10000 + " seconds)"));
        }

    }


    public static void printSudoku(int[][] board)
    {
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                System.out.print(board[i][j]);
                if(j != 2 && j != 5 && j < 8)
                    System.out.print("   ");
                else if(j == 2 || j == 5)
                    System.out.print(" | ");
                else
                    System.out.println();
            }
            if(i == 2 || i == 5)
                System.out.println("- - - - - | - - - - - | - - - - -");
        }
    }


    public static boolean sudokuSolver(int[][] board, int rowInput, int colInput)
    {
        for(int row = rowInput; row < SIZE; row++, colInput = 0)
        {
            for(int col = colInput; col < SIZE; col++)
            {
                if(board[row][col] == 0)
                {
                    for(int i = 1; i <= 9; i++)
                    {
                        if(isValid(board, row, col, i))
                        {
                            board[row][col] = i;
                            if(sudokuSolver(board, row, col + 1))
                                return true;
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        printSudoku(board);
        return true;
    }

    public static boolean isValid(int[][] board, int row, int col, int value)
    {
        int blockRow = (row / 3) * 3;
        int blockCol = (col / 3 ) * 3;
        for(int i = 0; i < 9; i++)
        {
            // Check Column || Check Row || Check 3x3 Boxes
            if(board[row][i] == value || board[i][col] == value || board[blockRow + i / 3][blockCol + i % 3] == value)
                return false;
        }
        return true;
    }
}

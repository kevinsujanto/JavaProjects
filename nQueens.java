import java.util.*;

public class nQueens {
    public static void main(String[] args)
    {
        System.out.println("Please Enter a Number Between 4 and 14 (14 will take ~ 100 seconds");
        System.out.println("This Number Will be Your Board Size (n x n)");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if(size > 14)
            return;
        long startTime = System.nanoTime();
        List<List<String>> listlist = solveNQueens(size);
        int count = 1;
        for(List<String> i : listlist) // 2 Answers
        {
            String ret = "";
            for(String j : i) // n Lines of String
            {
                ret += j;
            }
            System.out.println("Solution " + count + ":");
            drawBoard(size, ret);
            count++;
            System.out.println();
        }
        long totalTime = System.nanoTime() - startTime;
        System.out.println("Founded " + (count - 1) + " solution(s) in " + ((double) (totalTime / 100000) / 10000) + " seconds");
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                board[i][j] = '*';
        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }

    private static void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if(colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for(int i = 0; i < board.length; i++) {
            if(validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '*';
            }
        }
    }

    private static boolean validate(char[][] board, int x, int y) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < y; j++) {
                if(board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i))
                    return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void drawBoard(int size, String ret)
    {
        String horizontal = "+-------";
        String vertical = "|       ";
        for(int i = 0; i < size; i++)
        {
            String line = "";
            String line2 = "";
            String line3 = "";

            for(int j = 0; j < size; j++)
            {
                char c = ret.charAt(i*size + j);
                line += horizontal;
                line2 += vertical;
                line3 += "|   " + c + "   ";
            }
            System.out.println(line + "+");
            System.out.println(line2 + "|");
            System.out.println(line3 + "|");
            System.out.println(line2 + "|");
            if(i == size - 1)
                System.out.println(line + "+");

        }
    }



}

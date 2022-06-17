package listcode.staticlists;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class listMatrix {
    public void matrixPort() {
        Scanner scan = new Scanner(System.in);
        int uInput; 

        System.out.println("You have chosen the List Matrix.");
        System.out.println("How would you like to sort through your Integer Matrix?");
        System.out.println("1.) Spiral Form\n2.) Counter-ClockWise Spiral");

        try {
            uInput = scan.nextInt();
            switch(uInput) {
                case 1: 
                    System.out.println("======================");
                    cloSpiral();
                    break;
                case 2: 
                    System.out.println("======================");
                    counterSpirl();
                    break; 
                default: 
                    System.out.println("======================");
                    System.out.println("That integer is out of bounds, please try again.");
                    matrixPort();
                    break; 
                }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That input is invalid, please try again.");
            matrixPort();
        } 
        scan.close();
    }

    void counterSpirl() {
        Scanner scan = new Scanner(System.in);
        int uInput; 

        int[][] intMatrix = {{1, 2, 3}, {4, 5, 6}}; 

        System.out.println("You have chosen to traverse using Spiral Form.");
    }

    void cloSpiral() {
        Scanner scan = new Scanner(System.in);
        int uInput; 

        int[][] intMatrix = {{1, 2, 3, 4}, 
                             {5, 6, 7, 8},
                             {9, 10, 11, 12 }, 
                             {13, 14, 15, 16}}; 

        System.out.println("You have chosen to traverse using Counter-Clockwise Spiral Form.");
        System.out.println(spiralOrder(intMatrix));
    }
    // function to print in spiral order 
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return ans;
        }

        int m = matrix.length, n = matrix[0].length; 
        boolean[][] seen = new boolean[m][n]; 
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0}; 
        int x =0, y = 0, di = 0;
        // ITERATE FROM 0 TO R * C - 1
        for (int i  = 0; i < m * n; i++) {
            ans.add(matrix[x][y]); 
            seen[x][y] = true; 
            int cr = x + dr[di]; 
            int cc = y + dc[di]; 

            if (0 <= cr && cr < m && 0 <= cc && cc < n && !seen[cr][cc]) {
                x = cr; 
                y = cc; 
            } else {
                di = (di + 1) % 4; 
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }
}

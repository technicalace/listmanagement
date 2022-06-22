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
        int uInput, R = 4, C = 4; 

        int[][] intMatrix = {{1, 2, 3, 4}, 
                             {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}}; 

        System.out.println("You have chosen to traverse using Spiral Form.");
        countSpiralPrint(R, C, intMatrix);
    }

    static void countSpiralPrint(int m, int n, int intMatrix[][]) {
        int i, k = 0, l = 0;
        /* k - starting row index 
           m - ending row index 
           l - starting cloumn index 
           n - ending column index 
           i - iterator 
        */        
        // initialze count 
        int cnt = 0;

        // total number of elements in matrix 
        int total = m * n; 

        while (k < m && l < n) {
            if (cnt == total) {
                break;
            }

            // print the first column from the remaining columns 
            for (i = k; i < m; ++i) {
                System.out.println(intMatrix[i][l] + " ");
                cnt++;
            }
            l++; 

            if (cnt == total) {
                break;
            }

            // print the last row from the remaining rows 
            for (i = l; i < n; ++i) {
                System.out.println(intMatrix[m - 1][i] + " ");
            }
            m--;

            // print the last column from the remaing columns 
            if (k < m) {
                for (i = m - 1; i >= k; --i) {
                    System.out.println(intMatrix[i][n - 1] + "" );
                    cnt++; 
                }
            }

            if (cnt == total) {
                break; 
            }
            // print from the first row, from the remaining rows 
            if (l < n) {
                for (i = n - 1; i >= l; --i) {
                    System.out.println(intMatrix[k][i] + " ");
                    cnt++;
                }
                k++;
            }
        }
    }

    void cloSpiral() {
        Scanner scan = new Scanner(System.in);
        int uInput, R = 4, C = 4; 

        int[][] intMatrix = {{1, 2, 3, 4}, 
                             {5, 6, 7, 8},
                             {9, 10, 11, 12 }, 
                             {13, 14, 15, 16}}; 

        System.out.println("You have chosen to traverse using Clockwise Spiral Form.");
        spiralPrint(R, C, intMatrix);
    }
    // function to print in spiral order 
    static void spiralPrint(int m, int n, int intMatrix[][]) {
        int i, k = 0, l = 0; 
        /*  k - starting row index 
            m - ending row index 
            l - starting column index 
            n - ending column index 
            i = iterator 
         */


         while (k < m && l < n) {
            // print the first row from the remaining rows
            for (i = 0; i < n; i++) { 
                System.out.println(intMatrix[k][i] + " ");
            }
            k++; 

            // print the last row from the remaining rows 
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.println(intMatrix[m - 1][i] + " ");
                }
                m--;
            }

            // print the first column from the remaining columns
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.println(intMatrix[i][l] + " ");
                }
                l++;
            }
         }
    }
    
}

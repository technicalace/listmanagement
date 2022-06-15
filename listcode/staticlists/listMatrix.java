package listcode.staticlists;

import java.util.InputMismatchException;
import java.util.Scanner;


public class listMatrix {
    public void matrixPort() {
        Scanner scan = new Scanner(System.in);
        int uResp;
        
        System.out.println("You have chosen the list matrix ");
        System.out.println("What type of matrix would you prefer?\n1.) 2D Array\n2.) Multidemensional Array");

        try {
        uResp = scan.nextInt(); 
        if (uResp == 1) {
            System.out.println("======================");
            twodArray();
        } else if (uResp == 2) {
            System.out.println("======================");
            multiArray();
        } else {
            System.out.println("======================");
            System.out.println("That input is out of bounds, please try again");
            matrixPort();
        }
    } catch (InputMismatchException ie) {
        System.out.println("======================");
        System.out.println("That is an invalid input, please try again.");
        matrixPort();
    }
    scan.close();
    }

    void twodArray() {
        System.out.println("You have chosen 2D Arrays");
    }

    void multiArray() {
        System.out.println("You have chosen Multidemensional Array.");
    }
}

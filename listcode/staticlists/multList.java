package listcode.staticlists;

import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class multList {
    public void multPort() {
        Scanner scan = new Scanner(System.in);
        int uResp;
        
        System.out.println("You have chosen the multi array list ");
        System.out.println("What type of multi array would you prefer?\n1.) 2D Array\n2.) 3D Array");

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
            multPort();
        }
    } catch (InputMismatchException ie) {
        System.out.println("======================");
        System.out.println("That is an invalid input, please try again.");
        multPort();
    }
    scan.close();
    }

    void twodArray() {
        Scanner scan = new Scanner(System.in); 
        int uResp;
        // 2D STRING ARRAY/ LINKED HASHSET
        LinkedHashSet<LinkedHashSet<String> > stringArray = new LinkedHashSet<LinkedHashSet<String> >(); 
        stringArray.add(new LinkedHashSet<String>(Arrays.asList("Hello")));
        stringArray.add(new LinkedHashSet<String>(Arrays.asList("World", "Tell", "Me")));
        stringArray.add(new LinkedHashSet<String>(Arrays.asList("Why", "Ain't", "Nothin", "But")));
        stringArray.add(new LinkedHashSet<String>(Arrays.asList("A", "Mistake")));
        // 2D INTEGER ARRAY
        int[][] intArray = {{1, 2}, {3, 4}}; 

        System.out.println("You have chosen 2D Arrays");
        System.out.println("Choose which variable to use:\n1.) String\n2.) Integer");
        try {
            uResp = scan.nextInt();
            if (uResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen String.\nHere is your printed array of Strings: ");
                System.out.println(stringArray);
            } else if (uResp == 2) {
                System.out.println("======================");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(intArray[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("======================");
                System.out.println("That input is out of bounds, please try again.");
                twodArray();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            twodArray();
        }
        scan.close();
    }

    void multiArray() {
        Scanner scan = new Scanner(System.in); 
        int uResp;

        int[][][] intArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; 

        System.out.println("You have chosen 3D Array.");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(intArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}

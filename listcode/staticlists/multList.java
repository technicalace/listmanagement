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
        System.out.println("What type of multi array would you prefer?\n1.) 2D Array\n2.) Multidemensional Array");

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

        System.out.println("You have chosen 2D Arrays");
        System.out.println("Choose which variable to use:\n1.) String\n2.) Integer");
        try {
            uResp = scan.nextInt();
            if (uResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen String.\n How would you like to iterate through a 2D String array?");
                System.out.println("1) In Order\n2.) By Index");
                if (uResp == 1) {
                    System.out.println("======================");
                    System.out.println(stringArray);
                } else if (uResp == 2) {
                    System.out.println("======================");
                    System.out.println("Select your index ");
                }
            } else if (uResp == 2) {
                System.out.println("======================");
            
                
            } else {
                System.out.println("======================");

            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");

        }
    }

    void multiArray() {
        System.out.println("You have chosen Multidemensional Array.");
    }
}

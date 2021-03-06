package listcode;
import java.util.InputMismatchException;
import java.util.Scanner;

import listcode.nonstatic.freeResp;
import listcode.staticlists.doglist;
import listcode.staticlists.grocerylist;
import listcode.staticlists.listMatrix;
import listcode.staticlists.multList;
import listcode.staticlists.listRand;

class listportal {
    public static int userInt;
    public static void main(String[] args) { // introduction 
       Scanner uInput = new Scanner(System.in);

       System.out.println("Welcome to List Management, what lists would you like to use?\n1.) Static Arrays\n2.) Non-static Arrays");

       try {
       userInt = uInput.nextInt();      
       if (userInt == 1) { // STATIC ARRAYS
                System.out.println("======================");
                staticLists();
            } else if (userInt == 2) { // NON STATIC 
                System.out.println("======================");
                nonsLists();
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                main(args);
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            main(args);
        }
       uInput.close();
    }

    public static void staticLists() { // static lists
        Scanner uInput = new Scanner(System.in);
        doglist dl = new doglist();
        grocerylist gl = new grocerylist();
        listRand lr = new listRand();
        multList ml = new multList(); 
        listMatrix lm = new listMatrix(); 
       
        System.out.println("You have chosen static lists, which list do you find most desirable?\n1.) Dog List\n2.) Grocery List\n3.) Random Lists\n4.) Multi Array Lists\n5.) List Matrix");
        try {
        userInt = uInput.nextInt(); 
        switch (userInt) {
            case 1: 
                System.out.println("======================");
                dl.dogPortal();
                break;
            case 2: 
                System.out.println("======================");
                gl.groceryPortal();
                break;
            case 3: 
                System.out.println("======================"); 
                lr.lrandPortal();
                break; 
            case 4: 
                System.out.println("======================");
                ml.multPort();
                break;
            case 5: 
                System.out.println("======================");
                lm.matrixPort();
                break;
            default: 
                System.out.println("======================");
                System.out.println("That input is out of bounds, please try again.");
                break;
        }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            staticLists();
        }
           uInput.close();
    }

    public static void nonsLists() { // non static lists
        Scanner uInput = new Scanner(System.in);
        freeResp fr = new freeResp();

        System.out.println("You have chosen non-static lists, which list do you find most desirable?\n1.) Free Response");

        userInt = uInput.nextInt(); 

        if (userInt == 1) {
            try {
                System.out.println("======================");
                fr.frPortal(); 
            } catch (InputMismatchException ie) {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                nonsLists();
            }
        } else {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            nonsLists();
        }
        uInput.close();

    }
}
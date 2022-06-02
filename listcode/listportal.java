package listcode;
import java.util.InputMismatchException;
import java.util.Scanner;

import listcode.nonstatic.freeResp;
import listcode.staticlists.doglist;
import listcode.staticlists.grocerylist;

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
        doglist dl = new doglist(null, null, userInt); // change 
        grocerylist gl = new grocerylist();
        freeResp fr = new freeResp();
       
        System.out.println("You have chosen static lists, which list do you find most desirable?\n1.) Dog List\n2.) Grocery List");

        userInt = uInput.nextInt(); 

        if (userInt == 1) { // dog list input 
            try {
                System.out.println("======================");
                dl.dogPortal();
            } catch (InputMismatchException ie) {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                staticLists();
            }
           } else if (userInt == 2) { // grocery list input 
            try {
                System.out.println("======================");
                gl.groceryPortal();
            } catch (InputMismatchException ie) {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                staticLists();
            } 
           } else { // error input 
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
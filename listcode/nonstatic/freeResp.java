package listcode.nonstatic;
import java.util.Scanner;
import java.util.InputMismatchException;

public class freeResp { // PORTAL 
    public void frPortal() {
        Scanner scan = new Scanner(System.in);
        int uInput; 

        System.out.println("You have chosen Free Response.");
        System.out.println("What ArrayList type would you like to input for?");
        System.out.println("1.) String\n2.) Integer\n3.) Double");

        try {
            uInput = scan.nextInt(); 
            if (uInput == 1) {
                System.out.println("==========");
                stringArray();
            } else if (uInput == 2) {
                System.out.println("==========");
                intArray();
            } else if (uInput == 3) {
                System.out.println("==========");
                doubArray();
            } else {
                System.out.println("==========");
                System.out.println("That is not a valid input, please try again.");
                frPortal();
            }
        } catch (InputMismatchException ie) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            frPortal();
        }
        scan.close();
    }

    public void stringArray() { // STRING ARRAYS
        Scanner scan = new Scanner(System.in);
        String uResp;

        String[] stringArray = new String[5]; // array initiated 
        System.out.println("You have chosen String Array.\nInput 5 string variables:");
            for(int i = 0; i < stringArray.length; i++) { // user inputs 5 string variables (using looping)
                System.out.println("==========");
                uResp = scan.nextLine();
                stringArray[i] = uResp;
                if (!isString(uResp)) { // algorithym to check if the input is a string 
                    System.out.println("==========");
                    System.out.println("That is not a valid input,please try again");
                    stringArray();
                } 
            }
            for (String str : stringArray) { // prints out the array (fetches each element one by one.)
                System.out.println(str);
            }
            scan.close();
         }

    void intArray() { // INTEGER ARRAYS 
        Scanner scan = new Scanner(System.in); 
        int uResp;

        int[] intArray = new int[5]; // array initiated 
        System.out.println("You have chosen Integer Array.\nInput 5 integer variables:"); // intakes the user input for array 
        try {
            for (int i = 0; i < intArray.length; i++) { // user inputs 5 int variables (using looping)
                System.out.println("==========");
                uResp = scan.nextInt(); 
                intArray[i] = uResp;
            }
        } catch (InputMismatchException ie) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            intArray();
        }
        System.out.println("=========="); 
        for (int num : intArray) { // prints out the array 
            System.out.println(num);
        }
        scan.close();
    }

    void doubArray() { // DOUBLE ARRAYS 
        Scanner scan = new Scanner(System.in); 
        double uResp; 
        
        double[] doubArray = new double[5]; // initiates the array 
        System.out.println("You have chosen Double Array.\nInput 5 double variables:");
        try {
            for (int i = 0; i < doubArray.length; i++) { // user inputs 5 double variables (using looping)
                System.out.println("==========");
                uResp = scan.nextDouble(); 
                doubArray[i] = uResp; 
            }
        }  catch (InputMismatchException ie) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            doubArray(); 
        }
        System.out.println("==========");
        for (double dou : doubArray) { // prints out the array 
            System.out.println(dou);
        }
        scan.close();
    }

    public boolean isString(String uInput) { // checks if the input by user is a string variable
        return uInput.matches("[a-zA-Z]+");
    }
}

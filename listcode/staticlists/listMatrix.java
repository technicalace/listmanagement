package listcode.staticlists;
import java.util.InputMismatchException;
import java.util.Scanner;

public class listMatrix {
    public void matrixPort() {
        Scanner scan = new Scanner(System.in);
        int uInput; 

        System.out.println("You have chosen the List Matrix.");
        System.out.println("How would you like to sort through your Integer Matrix?");
        System.out.println("1.) Row Order\n2.) Column Order");

        try {
            uInput = scan.nextInt();
            switch(uInput) {
                case 1: 
                    System.out.println("======================");
                    rowOrder();
                    break;
                case 2: 
                    System.out.println("======================");
                    colOrder();
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

    void rowOrder() {

    }

    void colOrder() {

    }
}

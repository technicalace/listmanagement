package listcode.staticlists;

import java.util.InputMismatchException;
import java.util.Scanner;

public class doglist extends dog{
    public doglist(String name, String desc, int age) {
        super(name, desc, age);
        //TODO Auto-generated constructor stub
    }

    public void dogPortal() { // portal to other lists 
        Scanner scan = new Scanner(System.in);
        int uResp; 
       
        System.out.println("You have chosen Dog List."); // lines 23-24: opening sequence 
        System.out.println("What type of dog list would you like to use?\n1.) Dogs in Order\n2.) Selecting Dogs using Index\n3.) Selecting Dogs using Name");
        // lines 26-51: switch statement guiding user to dog lists 
        try {
        uResp = scan.nextInt();
        switch(uResp) {
            case 1: 
                System.out.println("======================");
                orderedList();
                break;
            case 2: 
                System.out.println("======================");
                dogSelect();
                break;
            case 3: 
                System.out.println("======================");
                nameDog();
                break;
            default: 
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                dogPortal();
                break;
        }
        }catch(InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            dogPortal();
        }
    }

    void orderedList() { // automatically prints dog objects according to hard code
        dog[] dg; 
        dg = new dog[2]; 

        dog d1 = new dog("Poodle\n===========", "Description\n===========\nCalled the Pudel in German and the Caniche in French, is a breed of water dog.", 6); 
        dog d2 = new dog("Pitbull\n===========", "Description\n===========\nA medium sized intelligent, short haired dog.", 2);
        dog d3 = new dog("Retro Pug\n===========", "Description\n===========\nA dog originally from China, with physically distinctive features of a wrinkly, short-muzzled face and curled tail.", 4);

        System.out.println("You have chosen to print out the dogs using order in code.");

        System.out.println("1.) " + d1.name);
    }

    void dogSelect() { // selects dog objects using index 
        System.out.println("You have chosen to select using index.");

    }

    void nameDog() { // selects dog objects depending on typed out name
        System.out.println("You have chosen to select dog using it's name.");
    }
}

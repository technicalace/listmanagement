package listcode.staticlists;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import java.util.ArrayList;

public class doglist extends dog{

    public void dogPortal() { // portal to other lists 
        Scanner scan = new Scanner(System.in);
        int uResp; 
       
        System.out.println("You have chosen Dog List."); // lines 23-24: opening sequence 
        System.out.println("What type of dog list would you like to use?\n1.) Dogs in Order\n2.) Selecting Dogs using Index\n3.) Selecting Dogs using Name\n4.) Sort through Name Array");
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
            case 4: 
                System.out.println("======================");
                arrNameD();
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
        
        dog dg1 = new dog(), dg2 = new dog(), dg3 = new dog(); // 3 dog objets 

        dg1.setName("Poodle"); dg1.setDesc("Description: Called the Pudel in German and the Caniche in French, is a breed of water dog."); dg1.setAge(6);
        dg2.setName("Pitbull"); dg2.setDesc("Description: A medium sized intelligent, short haired dog."); dg2.setAge(2);
        dg3.setName("Retro Pug"); dg3.setDesc("Description: A dog originally from China, with physical distinctive features of a wrinkly, short-muzzled face and curled tail."); dg3.setAge(4);

        System.out.println("You have chosen to print out the dogs using order in code.\n");

        System.out.println(dg1.getName() + "\n==========\n"+ dg1.getDesc() + "\nAge: " + dg1.getAge() + "\n==========\n"); // prints dog one 
        System.out.println(dg2.getName() + "\n==========\n"+ dg2.getDesc() + "\nAge: " + dg2.getAge() + "\n==========\n"); // prints dog two 
        System.out.println(dg3.getName() + "\n==========\n"+ dg3.getDesc() + "\nAge: " + dg3.getAge() + "\n==========\n"); // prints dog three
    }

    void dogSelect() { // selects dog objects using index         
        int uResp;

        Scanner scan = new Scanner(System.in); 
        dog dg1 = new dog(), dg2 = new dog(), dg3 = new dog(); // 3 dog objets 

        dg1.setName("Poodle"); dg1.setDesc("Description: Called the Pudel in German and the Caniche in French, is a breed of water dog."); dg1.setAge(6);
        dg2.setName("Pitbull"); dg2.setDesc("Description: A medium sized intelligent, short haired dog."); dg2.setAge(2);
        dg3.setName("Retro Pug"); dg3.setDesc("Description: A dog originally from China, with physical distinctive features of a wrinkly, short-muzzled face and curled tail."); dg3.setAge(4);

        System.out.println("You have chosen to select using index.");
        System.out.println("Input index of associated dog\n1.) Poodle\n2.) Pitbull\n3.) Retro Pug");
        
        try {
        uResp = scan.nextInt(); 
        switch(uResp) {
            case 1: 
                System.out.println("==========");
                System.out.println(dg1.getName() + "\n==========\n"+ dg1.getDesc() + "\nAge: " + dg1.getAge() + "\n==========\n"); // prints dog one 
                break; 
            case 2: 
                System.out.println("==========");
                System.out.println(dg2.getName() + "\n==========\n"+ dg2.getDesc() + "\nAge: " + dg2.getAge() + "\n==========\n"); // prints dog two 
                break;
            case 3: 
                System.out.println("==========");
                System.out.println(dg3.getName() + "\n==========\n"+ dg3.getDesc() + "\nAge: " + dg3.getAge() + "\n==========\n"); // prints dog three
                break; 
            default: 
                System.out.println("That is not a valid input, please try again.");
                dogSelect();
                break; 
                
        } 
        }catch (InputMismatchException ie) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            dogSelect();
        }
        scan.close();
    }

    void nameDog() { // selects dog objects depending on typed out name
        String uResp; 
        Scanner scan = new Scanner(System.in);

        dog dg1 = new dog(), dg2 = new dog(), dg3 = new dog(); // 3 dog objets 

        dg1.setName("Poodle"); dg1.setDesc("Description: Called the Pudel in German and the Caniche in French, is a breed of water dog."); dg1.setAge(6);
        dg2.setName("Pitbull"); dg2.setDesc("Description: A medium sized intelligent, short haired dog."); dg2.setAge(2);
        dg3.setName("Retro Pug"); dg3.setDesc("Description: A dog originally from China, with physical distinctive features of a wrinkly, short-muzzled face and curled tail."); dg3.setAge(4);

        System.out.println("You have chosen to select dog using it's name.");
        System.out.println("Input name of dog using string\n1.) Poodle\n2.) Pitbull\n3.) Retro Pug");

        try {
        uResp = scan.nextLine();
        if(uResp.equalsIgnoreCase("Poodle")) { // POODLE       
            System.out.println("==========");
            System.out.println(dg1.getName() + "\n==========\n"+ dg1.getDesc() + "\nAge: " + dg1.getAge() + "\n==========\n"); // prints dog one 
        } else if(uResp.equalsIgnoreCase("Pitbull")) { // PITBULL
            System.out.println("==========");
            System.out.println(dg2.getName() + "\n==========\n"+ dg2.getDesc() + "\nAge: " + dg2.getAge() + "\n==========\n"); // prints dog two 
        } else if(uResp.equalsIgnoreCase("Retro Pug")) { // RETRO PUG
            System.out.println("==========");
            System.out.println(dg3.getName() + "\n==========\n"+ dg3.getDesc() + "\nAge: " + dg3.getAge() + "\n==========\n"); // prints dog three
        } else { // ERROR OUTPUT: INT OUT OF BOUNDS 
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            nameDog();
        }
        } catch (InputMismatchException ie) { // ERROR OUTPUT: WRONG INDEX 
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            nameDog();
        }
        scan.close();
    }

    void arrNameD() { // prints out string array of breeds
        int i; 

        String[] dogNames = {"Poodle", "Pitbull", "Retro Pug", 
                            "Golden Retriever", "German Shepard", 
                            "Alaskan Malamute", "Beagle"}; 
        
        System.out.println("Here is your array");
        for(i = 0; i <= 6; i++) { // uses i as index (i starts at 0 then sorts trough string array of breeds until it reaches the last name (index 6))
            System.out.println(dogNames[i]); // prints out the process 
        }
    }
}

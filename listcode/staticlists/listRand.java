package listcode.staticlists;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class listRand {
    public void lrandPortal() {
        Scanner scan = new Scanner(System.in);
        int uResp; 

        System.out.println("You have chosen the Random Lists\nWhat list type would you like to take?");
        System.out.println("1.) String Lists\n2.) Integer Lists\n3.) Double Lists\n4.) Character Lists");
        try {
        uResp = scan.nextInt(); 
        switch (uResp) {
            case 1: 
                System.out.println("======================");
                stringLists();
                break;
            case 2: 
                System.out.println("======================");
                intLists();
                break;
            case 3: 
                System.out.println("======================");
                doubleLists();
                break;
            case 4: 
                System.out.println("======================");
                charLists();
                break;
            default: 
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                lrandPortal();
                break;
        }
        } catch(InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            lrandPortal();
        }
        scan.close();
    }

    void stringLists() {
        Scanner scan = new Scanner(System.in);
        int uResp, i; 

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mustangg");
        cars.add("Ford");
        cars.add("Ferrari");
        cars.add("BMW"); 
        cars.add("Audi"); 

        System.out.println("You have chosen String Lists, which function would you like to use for random string list?");
        System.out.println("1.) Print out in Order\n2.) Print out from Index\n3.) Print out largest Name");

        try {
            uResp = scan.nextInt(); 
            switch(uResp) {
                case 1: // PRINTS OUT ARRAY IN ORDER
                    System.out.println("======================");
                    for(i = 0; i <= 4; i++) { // starts index from 0 and counts up to the 4th index of the cars array
                        System.out.println(cars.get(i)); // prints the process
                    }
                    break; 
                case 2: // PRINTS OUT CAR FROM USERS CHOICE 
                    System.out.println("======================"); // 
                    System.out.println("Chooose which index (1-5)");
                    i = scan.nextInt();
                    switch(i) {
                        case 1: 
                            System.out.println("======================");
                            System.out.println(cars.get(0));
                            break; 
                        case 2: 
                            System.out.println("======================");
                            System.out.println(cars.get(1));
                            break;
                        case 3:
                            System.out.println("======================");
                            System.out.println(cars.get(2));
                            break; 
                        case 4: 
                            System.out.println("======================");
                            System.out.println(cars.get(3));
                            break; 
                        case 5: 
                            System.out.println("======================");
                            System.out.println(cars.get(4));
                            break; 
                        default: 
                            System.out.println("======================");
                            System.out.println("That is not a valid input, please try again.");
                            stringLists();
                            break;
                    }
                    break;
                case 3: // PRINTS OUT LONGEST STRING IN CARS ARRAY
                    String max = Collections.max(cars, Comparator.comparing(String::length)); 
                    System.out.println("======================");
                    System.out.println(max);
                    break;
                default: 
                    System.out.println("======================");
                    System.out.println("That's an invalid input, please try again.");
                    stringLists();
                    break;
            }
            } catch(InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            stringLists();
            }
            scan.close();
    }

    void intLists() {
        Scanner scan = new Scanner(System.in);
        int uResp; 
        System.out.println("You have chosen Integer Lists, which function would you like to use for random integer list?");

    }

    void doubleLists() {
        Scanner scan = new Scanner(System.in);
        int uResp; 
        System.out.println("You have chosen Double Lists, which function would you like to use for random double list?");

    }

    void charLists() {
        Scanner scan = new Scanner(System.in);
        int uResp; 
        System.out.println("You have chosen Character Lists, which function would you like to use for random character list?");

    }
}

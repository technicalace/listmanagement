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
        int uResp, i; 

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(34); 
        intList.add(993);
        intList.add(3);
        intList.add(45);
        intList.add(1000);

        System.out.println("You have chosen Integer Lists, which function would you like to use for random integer list?");
        System.out.println("1.) Print out in Order\n2.) Print Highest Integer\n3.) Print Integer in specified Index");

        try {
            uResp = scan.nextInt(); 
            switch(uResp) {
                case 1: 
                    System.out.println("======================");
                    for(i = 0; i <= 4; i ++) {
                        System.out.println(intList.get(i));
                    }
                    break; 
                case 2: 
                    System.out.println("======================");
                    System.out.println("You have chosen to print the highest integer.\n\n");
                    System.out.println(Collections.max(intList));
                    break;
                case 3: 
                    System.out.println("======================");
                    System.out.println("Please select index between (1-5): ");
                    i = scan.nextInt(); 
                    switch(i) {
                        case 1: 
                            System.out.println("======================");
                            System.out.println(intList.get(0));
                            break; 
                        case 2: 
                            System.out.println("======================");
                            System.out.println(intList.get(1));
                            break; 
                        case 3: 
                            System.out.println("======================");
                            System.err.println(intList.get(2));
                            break; 
                        case 4: 
                            System.out.println("======================");
                            System.out.println(intList.get(3));
                            break;
                        case 5: 
                            System.out.println("======================");
                            System.out.println(intList.get(4));
                            break; 
                        default:
                            System.out.println("======================");
                            System.out.println("That is not a valid input, please try again.");
                            break; 
                    }
                default: 
                    System.out.println("======================");
                    System.out.println("That is not a valid input, please try again.");
                    break;
            }
            } catch (InputMismatchException ie) {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                intLists();
            }

    }

    void doubleLists() {
        Scanner scan = new Scanner(System.in);
        int uResp, i; 

        ArrayList<Double> doubList = new ArrayList<Double>(); 
        doubList.add(90.5); 
        doubList.add(3.45); 
        doubList.add(456.7); 
        doubList.add(12.0);
        doubList.add(4.23);

        System.out.println("You have chosen Double Lists, which function would you like to use for random double list?");
        System.out.println("1.) Print in Order\n2.) Print Largest\n3.) Print from Index");

        try {
        uResp = scan.nextInt(); 
        switch(uResp) {
            case 1: 
                System.out.println("======================");
                System.out.println("You have chosen to print the doubles in order:");
                for (i = 0; i <= 4; i++) {
                    System.out.println(doubList.get(i));
                }
                break; 
            case 2: 
                System.out.println("======================");
                System.out.println("You have chosen to print the largest double\n"+Collections.max(doubList));
                break;
            case 3: 
                System.out.println("======================");
                System.out.println("Please choose your index (1-5)");
                i = scan.nextInt(); 
                switch(i) {
                    case 1: 
                        System.out.println("======================");
                        System.out.println(doubList.get(0));
                        break; 
                    case 2: 
                        System.out.println("======================");
                        System.out.println(doubList.get(1));
                        break; 
                    case 3: 
                        System.out.println("======================");
                        System.out.println(doubList.get(2));
                        break; 
                    case 4: 
                        System.out.println("======================");
                        System.out.println(doubList.get(3));
                        break; 
                    case 5: 
                        System.out.println("======================");
                        System.out.println(doubList.get(4));
                        break; 
                    default: 
                    System.out.println("======================");
                    System.out.println("That is not a valid input, please try again.");
                    doubleLists();
                    break;
                }
            default: 
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                doubleLists();
                break; 
        }
        } catch(InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            doubleLists();
        }
        scan.close();
    }

    void charLists() {
        Scanner scan = new Scanner(System.in);
        int uResp, i;
        
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('d');
        charList.add('e');

        System.out.println("You have chosen Character Lists, which function would you like to use for random character list?");
        System.out.println("1.) Print in Order\n2.) Print from Index\n3.) Print length of Array");

        try {
            uResp = scan.nextInt(); 
            switch(uResp) {
                case 1: 
                    System.out.println("======================");
                    for (i = 0; i <= 4; i++) {
                        System.out.println(charList.get(i));
                    }
                    break; 
                case 2: 
                    System.out.println("======================");
                    System.out.println("Select your index(1-5): ");
                    try {
                        i = scan.nextInt(); 
                        switch(i) {
                            case 1: 
                                System.out.println("======================");
                                System.out.println(charList.get(0));
                                break;
                            case 2: 
                                System.out.println("======================");
                                System.out.println(charList.get(1));
                                break; 
                            case 3: 
                                System.out.println("======================");
                                System.out.println(charList.get(2));
                                break; 
                            case 4: 
                                System.out.println("======================");
                                System.out.println(charList.get(3));
                                break; 
                            case 5: 
                                System.out.println("======================");
                                System.out.println(charList.get(4));
                                break; 
                            default: 
                                System.out.println("======================");
                                System.out.println("That is an invalid input, please try again.");
                                charLists();
                                break;
                        }
                    } catch(InputMismatchException ie) {
                        System.out.println("======================");
                        System.out.println("That is not a valid input, please try again.");
                    }
                    break;
                case 3: 
                    System.out.println("======================");
                    System.out.println("The size of the array is: ");
                    System.out.println(charList.size());
                    break; 
                default: 
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    charLists();
                    break; 
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            charLists();
        }
    }
}

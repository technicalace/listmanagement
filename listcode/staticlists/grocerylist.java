package listcode.staticlists;
import java.util.InputMismatchException;
import java.util.Scanner;

public class grocerylist {
    public void groceryPortal() {
        Scanner scan = new Scanner(System.in);
        int userResp; 

        System.out.println("You have chosen Grocery List.");
        System.out.println("What variables would you like to sort from?");
        System.out.println("1.) Products\n2.) Prices");
        try {
            userResp = scan.nextInt(); 
            if (userResp == 1) {
                System.out.println("======================");
                prodGrocery(); 
            } else if (userResp == 2) {
                System.out.println("======================");
                pricGrocery();
            } else {
                System.out.println("That is not a valid input, please try again. ");
                groceryPortal();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is not a valid input, please try again.");
            groceryPortal();
        }
        scan.close();
    }

    public void prodGrocery() { // **PRODUCT PORTAL**
        Scanner scan = new Scanner(System.in);
        int userResp;

        System.out.println("You have chosen the Products.\nWhat type?");
        System.out.println("1.) Fruits\n2.) Vegetables\n3.) Dairy\n4.) Meat");
        try {
            userResp = scan.nextInt(); 
            if (userResp == 1) {
                System.out.println("======================");
                prodFruits();
            } else if (userResp == 2) {
                System.out.println("======================");
                prodVeg();
            } else if (userResp == 3) {
                System.out.println("======================");
                prodDairy();
            } else if (userResp == 4) {
                System.out.println("======================");
                prodMeat();
            } else {
                System.out.println("======================");
                System.out.println("That is an invalid input, please try again.");
                prodGrocery();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            prodGrocery();
        }
        scan.close();
    }

    public void prodFruits() { // **PRODUCTS FRUITS**
        Scanner scan = new Scanner(System.in);
        int userResp;

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Strawberrys"); 
        itm2.setProduct("Bannanas");
        itm3.setProduct("Guavas"); 

        System.out.println("You have chosen Fruits, how would you like to traverse the items?");
        System.out.println("1.) Fruits in Order\n2.) The Longest Named Fruit\n3.) Fruit from Index");
        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getProduct());
                System.out.println(itm2.getProduct());
                System.out.println(itm3.getProduct());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm1.getProduct());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getProduct());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getProduct());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getProduct());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    prodFruits();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                prodFruits();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            prodFruits();
        }
        scan.close();
    }

    public void prodVeg() { // **PRODUCT VEGETABLES**
        Scanner scan = new Scanner(System.in);
        int userResp;

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Carrots"); 
        itm2.setProduct("Onions");
        itm3.setProduct("Cabbage"); 

        System.out.println("You have chosen vegetables, how would you like to traverse the items?");
        System.out.println("1.) Vegetables in Order\n2.) The Longest Named Vegetable\n3.) Vegetable from Index");

        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getProduct());
                System.out.println(itm2.getProduct());
                System.out.println(itm3.getProduct());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm2.getProduct());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getProduct());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getProduct());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getProduct());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    prodVeg();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                prodVeg();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            prodVeg();
        }
        scan.close();
    }

    public void prodDairy() { // **PRODUCT DAIRY**
        Scanner scan = new Scanner(System.in);
        int userResp;

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Milk"); 
        itm2.setProduct("Yogurt");
        itm3.setProduct("Sour Creme"); 

        System.out.println("You have chosen dairy, how would you like to traverse the items?");
        System.out.println("1.) Dairy in Order\n2.) The Longest Named Dairy Product\n3.) Dairy from Index");

        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getProduct());
                System.out.println(itm2.getProduct());
                System.out.println(itm3.getProduct());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm3.getProduct());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getProduct());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getProduct());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getProduct());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    prodDairy();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                prodDairy();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            prodDairy();
        }
        scan.close();
    }

    public void prodMeat() { // **PRODUCT MEAT** 
        Scanner scan = new Scanner(System.in);
        int userResp;

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Steak"); 
        itm2.setProduct("Ham");
        itm3.setProduct("Beef"); 

        System.out.println("You have chosen meat, how would you like to traverse the items?");
        System.out.println("1.) Meat in Order\n2.) The Longest Named meat Product\n3.) Meat from Index");

        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getProduct());
                System.out.println(itm2.getProduct());
                System.out.println(itm3.getProduct());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm3.getProduct());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getProduct());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm1.getProduct());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getProduct());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    prodMeat();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                prodMeat();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            prodMeat();
        }
        scan.close();
    }

    public void pricGrocery() { // **PRICE PORTAL**
        Scanner scan = new Scanner(System.in);
        int userResp; 

        System.out.println("You have chosen the Price.\nWhat type?");
        System.out.println("1.) Fruits\n2.) Vegetables\n3.) Dairy\n4.) Meat");
        try {
            userResp = scan.nextInt(); 
            if (userResp == 1) {
                System.out.println("======================");
                pricFruits();
            } else if (userResp == 2) {
                System.out.println("======================");
                pricVeg();
            } else if (userResp == 3) {
                System.out.println("======================");
                pricDairy();
            } else if (userResp == 4) {
                System.out.println("======================");
                pricMeat();
            } else {
                System.out.println("======================");
                System.out.println("That is an invalid input, please try again.");
                pricGrocery();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            pricGrocery();
        }
        scan.close();
    }

    public void pricFruits() { // **PRICES FRUIT**
        Scanner scan = new Scanner(System.in);
        int userResp; 

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Strawberrys"); itm1.setPrice(4.00); 
        itm2.setProduct("Bannanas"); itm2.setPrice(6.67);
        itm3.setProduct("Guavas"); itm3.setPrice(5.90); 

        System.out.println("You have chosen the fruit prices, how would you like your prices to be printed? ");
        System.out.println("1.) Prices in Order\n2.) The Largest Price\n3.) From Index");
        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getPrice());
                System.out.println(itm2.getPrice());
                System.out.println(itm3.getPrice());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm2.getPrice());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getPrice());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getPrice());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getPrice());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    pricFruits();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                pricFruits();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            pricFruits();
        }
        scan.close();
    }

    public void pricVeg() { // **PRICES VEGETABLES** 
        Scanner scan = new Scanner(System.in);
        int userResp; 

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Carrots"); itm1.setPrice(3.00); 
        itm2.setProduct("Cabbage"); itm2.setPrice(4.78);
        itm3.setProduct("Onions"); itm3.setPrice(5.87); 

        System.out.println("You have chosen the vegetable prices, how would you like your prices to be printed? ");
        System.out.println("1.) Prices in Order\n2.) The Largest Price\n3.) From Index");
        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getPrice());
                System.out.println(itm2.getPrice());
                System.out.println(itm3.getPrice());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm3.getPrice());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getPrice());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getPrice());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getPrice());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    pricVeg();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                pricVeg();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            pricVeg();
        }
        scan.close();
    }

    public void pricDairy() { // **PRICES DAIRY**
        Scanner scan = new Scanner(System.in);
        int userResp; 

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Milk"); itm1.setPrice(4.00); 
        itm2.setProduct("Yogurt"); itm2.setPrice(7.56);
        itm3.setProduct("Sour Cream"); itm3.setPrice(3.00); 

        System.out.println("You have chosen the dairy prices, how would you like your prices to be printed? ");
        System.out.println("1.) Prices in Order\n2.) The Largest Price\n3.) From Index");
        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getPrice());
                System.out.println(itm2.getPrice());
                System.out.println(itm3.getPrice());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm2.getPrice());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getPrice());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getPrice());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getPrice());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    pricDairy();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                pricDairy();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            pricDairy();
        }
        scan.close();
    }

    public void pricMeat() { // **PRICES MEAT**
        Scanner scan = new Scanner(System.in);
        int userResp; 

        item itm1 = new item(), itm2 = new item(), itm3 = new item();

        itm1.setProduct("Steak"); itm1.setPrice(27.78); 
        itm2.setProduct("Ham"); itm2.setPrice(9.78);
        itm3.setProduct("Beef"); itm3.setPrice(20.98); 

        System.out.println("You have chosen the meat prices, how would you like your prices to be printed? ");
        System.out.println("1.) Prices in Order\n2.) The Largest Price\n3.) From Index");
        try {
            userResp = scan.nextInt();
            if (userResp == 1) {
                System.out.println("======================");
                System.out.println("You have chosen to print in order: ");
                System.out.println(itm1.getPrice());
                System.out.println(itm2.getPrice());
                System.out.println(itm3.getPrice());
            } else if (userResp == 2) {
                System.out.println("======================");
                System.out.println("You have chosen to print the longest: ");
                System.out.println(itm1.getPrice());
            } else if (userResp == 3) {
                System.out.println("======================");
                System.out.println("Choose index(1-3): ");
                int index = scan.nextInt(); 
                if (index == 1) {
                    System.out.println("======================");
                    System.out.println(itm1.getPrice());
                } else if (index == 2) {
                    System.out.println("======================");
                    System.out.println(itm2.getPrice());
                } else if (index == 3) {
                    System.out.println("======================");
                    System.out.println(itm3.getPrice());
                } else {
                    System.out.println("======================");
                    System.out.println("That is an invalid input, please try again.");
                    pricMeat();
                }
            } else {
                System.out.println("======================");
                System.out.println("That is not a valid input, please try again.");
                pricMeat();
            }
        } catch (InputMismatchException ie) {
            System.out.println("======================");
            System.out.println("That is an invalid input, please try again.");
            pricMeat();
        }
        scan.close();
    }
}

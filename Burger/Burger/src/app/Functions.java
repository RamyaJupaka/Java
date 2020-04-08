package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Functions
 */
public class Functions {

    private static ArrayList<Burger> burgers = new ArrayList<Burger>();
    static Scanner input;
    private static Burger burger;
    private static Bill bill = new Bill();

    public static void createBurger() {
        BasciBurger basciBurger = new BasciBurger();
        HealtyBurger healtyBurger = new HealtyBurger();
        DeluxBurger deluxBurger = new DeluxBurger();

        burgers.add(basciBurger);
        burgers.add(healtyBurger);
        burgers.add(deluxBurger);
    }

    public static void displayMenu() {
       
        System.out.println("Welcome to Burger");
        System.out.println("Select Your Burger");
        int couter = 1;
        for (Burger oneBurger : burgers) {

            System.out.println(couter + " " + oneBurger.toString());
            couter++;
        }
        
    }

    public static void selectBurger() {
        int select;

        System.out.println("Select Your choice");
        input = new Scanner(System.in);
        select = input.nextInt();

        switch(select){
            case 1:
                burger = new BasciBurger();
                break;
            case 2:
                burger = new HealtyBurger();
                break;
            case 3:
                burger = new DeluxBurger();
                break;
            default:
                System.out.println("Please enter correct choice");
                displayMenu();
                break;

        }
        bill.setBurger(burger);
        System.out.println(burger);
        
    }

 
    public static void displayToppings(){
        
        System.out.println("Select your Items");
        int couter = 1;
        int toppingCount = burger.getTopingMax();
		System.out.println("Please select " + toppingCount + " toppings\n");
        for (Topping oneTopping : burger.getToppings()) {
            System.out.println(couter + " " + oneTopping.toString());
            couter++;
        }
      
		try {
			input = new Scanner(System.in);		
			int select = input.nextInt();
			// System.out.println("selected topping");
			selectTopping(select);
			// displayMenu();
		}
		catch (Exception e) {
			displayToppings();
		}

    }

   
    public static void selectTopping(int select){
  
        switch(select){
            case 1:
                bill.addTopping(burger.getToppings().get(0));
                break;
            case 2:
                bill.addTopping(burger.getToppings().get(1));
                break;
            case 3:
                bill.addTopping(burger.getToppings().get(2));
                break;
            case 4:
                bill.addTopping(burger.getToppings().get(3));
                break;
            case 5:
                bill.addTopping(burger.getToppings().get(4));
                break;
            case 6: 
                bill.addTopping(burger.getToppings().get(5));
                break;
            default:
                System.out.println("Please enter correct choice");
                displayToppings();
                break;

        }

    }

    
}
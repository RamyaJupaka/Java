package app;

import java.util.ArrayList;

/**
 * bill
 */
public class Bill {

    private Burger burger;
    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    /**
     * @param burger the burger to set
     */
    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    public void addTopping(Topping oneTopping){
       this.toppings.add(oneTopping);
        if(this.burger.getTopingMax() == toppings.size()){
            printBill();
        }
        else{
           Functions. displayToppings();
        }
    }

    public double calculator(){
        double total = 0;
        total += burger.getPrice();

        for (Topping topping : toppings) {
            total += topping.getPrice();            
        }
        return total;
    }

    public void printBill(){
        double total = calculator();
        System.out.println("Bill");
        System.err.println(burger);
        for(Topping topping : toppings){
            System.out.println(topping);
        }
        System.out.println("Price: " + total);

    }
    
}
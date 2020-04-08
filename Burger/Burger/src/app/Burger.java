package app;

import java.util.ArrayList;

/**
 * Burger
 */

    enum RollType{
        Write,
        Brown
    }
    
public class Burger {

    private String name;
    private double price;
    private int topingMax;
    private RollType bread;
    private String meat;

    private ArrayList<Topping> toppings = new ArrayList<Topping>();

    public Burger(String name, RollType bread, String meat,double price,int topingMax ){
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.topingMax = topingMax;
    }

    public Burger(){
        // default contructor
    }

    /** 
     * @param toppings the toppings to set
     */
    public void setToppings(Topping toppings) {
        this.toppings.add(toppings);
    }

    /**
     * @return the topingMax
     */
    public int getTopingMax() {
        return topingMax;
    }
    /**
     * @return the toppings
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        
        return this.name + " on a " + this.bread + " with " + this.meat + " : Price: " + this.price;
    }
   
}
package app;

/**
 * Topping
 */
public class Topping {
    public String name;
    public double price;

    public Topping(String name,double price){
        this.name = name;
        this.price = price;
    } 
    
    @Override
    public String toString() {
        return this.name + " price: " + this.price + "\n";
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }
}
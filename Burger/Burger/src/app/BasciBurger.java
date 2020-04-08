package app;

/**
 * BasciBurger
 */
public class BasciBurger extends Burger {
    public BasciBurger(){
        super("Basci Burger",RollType.Write, "Bacon", 3.45, 4);
        setToppings(new Topping("Tomato",2.45));
        setToppings(new Topping("Lettuce",5.43));
        setToppings(new Topping("Onion",1.45));
        setToppings(new Topping("Carrot",3.43));       
    }
    
    public BasciBurger(String name, RollType bread, String meat,double price,int topingMax){
        super(name, bread, meat, price,topingMax);
        setToppings(new Topping("Tomato",2.45));
        setToppings(new Topping("Lettuce",5.43));
        setToppings(new Topping("Onion",1.45));
        setToppings(new Topping("Carrot",3.43));
    }
    
    
}
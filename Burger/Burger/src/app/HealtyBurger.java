package app;

/**
 * HealtyBurger
 */
public class HealtyBurger extends BasciBurger {

    public HealtyBurger(){
        super("Healty Burger",RollType.Brown, "Sussage", 5.45, 6);
        setToppings(new Topping("Egg",6.00));
        setToppings(new Topping("Milk", 15.00));
    }
    
}
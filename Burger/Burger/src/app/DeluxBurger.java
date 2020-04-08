package app;

/**
 * DeluxBurger
 */
public class DeluxBurger extends Burger {

    public DeluxBurger(){
        super("Delux Burger", RollType.Brown, "Bacon", 16.45, 2);
            setToppings(new Topping("Drink",8.43));
            setToppings(new Topping("Chips",6.32));
        
    }
    
}
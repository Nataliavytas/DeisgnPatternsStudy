package SimpleFactory;

public class Pizzeria {

    public Pizza createSmallPizza(){
        // DB, File, API
        return new Pizza(6);
    }

    public Pizza createMediumPizza(){
        return new Pizza(8);
    }

    public Pizza createBigPizza(){
        return new Pizza(12);
    }
}

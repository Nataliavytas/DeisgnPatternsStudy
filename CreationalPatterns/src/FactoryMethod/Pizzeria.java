package FactoryMethod;

public class Pizzeria implements IPizzeria{


    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Pepperoni")){
            return new Pizza(8, "Pepperoni");
        }

        if(type.equals("Hawaian")){
            return new Pizza(8, "Hawaian");
        }

        if(type.equals("Pepperoni special")){
            return new SpecialPizza(12, "Pepperoni");
        }
        return null;
    }
}

package FactoryMethod;

public class Main {

    /**
     * Define an interface for creating an object (IPizzeria), but let subclasses decide which class to instantiate (Pizzeria).
     * Factory method lets a class defer instantiation to subclasses.
     */
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        Pizza pepperoni = pizzeria.createPizza("Pepperoni");
        Pizza hawaian = pizzeria.createPizza("Hawaian");
        Pizza specialPepperoni = pizzeria.createPizza("Pepperoni special");

        System.out.println(pepperoni);
        System.out.println(hawaian);
        System.out.println(specialPepperoni);

    }


}

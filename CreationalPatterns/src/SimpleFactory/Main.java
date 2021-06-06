package SimpleFactory;

public class Main {
    public static void main(String[] args) {

      Pizzeria pizzeria = new Pizzeria();

      Pizza pizzaPeperoni = pizzeria.createSmallPizza();

      System.out.println(pizzaPeperoni);
    }
}

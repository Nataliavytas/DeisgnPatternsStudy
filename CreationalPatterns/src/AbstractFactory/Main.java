package AbstractFactory;

public class Main {
    /**
     * Provide an interface for creating families of related or dependent objects
     * without specifying their concrete classes.
     */
    public static void main(String[] args) {
        SamsungStore samsung = new SamsungStore();
        AppleStore apple = new AppleStore();

        IComputer mac = apple.createComputer();
        ITablet ipad = apple.createTablet();

        IComputer qx = samsung.createComputer();
        ITablet s3 = samsung.createTablet();
    }
}

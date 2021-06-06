package ConcurrentSingleton;

public class Main {

    /**
     * Ensure a class only has one instance,
     * and provide a global point of access to it
     */
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connection = ConnectionDB.getConnection();
                System.out.println(connection.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConnectionDB connection = ConnectionDB.getConnection();
                System.out.println(connection.hashCode());
            }
        });

        t1.run();
        t2.run();
    }
}

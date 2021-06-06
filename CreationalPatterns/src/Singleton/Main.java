package Singleton;

public class Main {

    /**
     * Ensure a class only has one instance,
     * and provide a global point of access to it
     */
    public static void main(String[] args) {

        ConnectionDB connection = ConnectionDB.getConnection();
        ConnectionDB connection2 = ConnectionDB.getConnection();
        ConnectionDB connection3 = ConnectionDB.getConnection();

        System.out.println(connection.hashCode());
        System.out.println(connection2.hashCode());
        System.out.println(connection3.hashCode());
    }
}

package Singleton;

public class ConnectionDB {

    private static ConnectionDB connectionDB;

    private ConnectionDB() {

    }

    public static ConnectionDB getConnection(){
        if(connectionDB == null){
            connectionDB = new ConnectionDB();
        }
        return connectionDB;
    }

}

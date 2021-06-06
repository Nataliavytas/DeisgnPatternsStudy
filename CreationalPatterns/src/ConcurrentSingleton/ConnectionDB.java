package ConcurrentSingleton;

public class ConnectionDB {

    private static ConnectionDB connectionDB;

    private ConnectionDB() {

    }

    public synchronized static ConnectionDB getConnection(){
        if(connectionDB == null){
            connectionDB = new ConnectionDB();
        }
        return connectionDB;
    }

}

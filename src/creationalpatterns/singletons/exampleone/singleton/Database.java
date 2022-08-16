package creationalpatterns.singletons.exampleone.singleton;

import static java.util.Objects.isNull;

public class Database {

    private static Database database;
    private String connectionName;
    private int maxConnectionQuantity;

    public String getConnectionName() {
        return connectionName;
    }

    public int getMaxConnectionQuantity() {
        return maxConnectionQuantity;
    }

    private Database() {
        this.connectionName = "localhost:8080";
        this.maxConnectionQuantity = 4;
    }

    public static Database getInstance() {
        if (isNull(database)) {
            database = new Database();
            return database;
        }
        return database;
    }
}

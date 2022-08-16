package creationalpatterns.singletons.exampleone;

import creationalpatterns.singletons.exampleone.singleton.Database;

public class Main {

    public static void main(String[] args) {
        final var dataBase = Database.getInstance();
        System.out.println("database: " + dataBase);
        final var newDataBase = Database.getInstance();
        System.out.println("newDatabase: " + newDataBase);

        System.out.println("database equals newDatabase: " + dataBase.equals(newDataBase));
    }
}

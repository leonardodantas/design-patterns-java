package creationalpatterns.singletons.exampletwo;

import creationalpatterns.singletons.exampletwo.singleton.Logger;

public class Main {

    public static void main(String[] args) {

        final var logger = Logger.getInstance();
        logger.success("Nova instancia criada com sucesso");

        final var newLogger = Logger.getInstance();
        newLogger.success("Nova instancia criada com sucesso");

        System.out.println("logger equals newLogger: " + logger.equals(newLogger));
    }
}

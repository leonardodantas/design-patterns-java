package creationalpatterns.singletons.exampletwo.singleton;

import static java.util.Objects.isNull;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (isNull(logger)) {
            logger = new Logger();
            return logger;
        }
        return logger;
    }

    public void success(final String message){
        System.out.println("Success: " + message);
    }

}

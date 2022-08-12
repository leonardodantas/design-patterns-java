package creationalpatterns.abstractmethod.exampleone;

import creationalpatterns.abstractmethod.exampleone.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampleone.concretefactories.ModernFactory;
import creationalpatterns.abstractmethod.exampleone.concretefactories.VictorianFactory;

public class Main {

    public static void main(String[] args) {
        final var modernFactory = new ModernFactory();
        final var victorianFactory = new VictorianFactory();

        System.out.println("----------------------------------------");
        final var chairModern = modernFactory.createChair();
        chairModern.execute();
        final var couchModern = modernFactory.createCouch();
        couchModern.execute();
        System.out.println("----------------------------------------");
        final var chairVictorian = victorianFactory.createChair();
        chairVictorian.execute();
        final var couchVictorian = victorianFactory.createCouch();
        couchVictorian.execute();

    }
}

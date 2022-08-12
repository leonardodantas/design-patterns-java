package creationalpatterns.abstractmethod.exampletwo;

import creationalpatterns.abstractmethod.exampletwo.concretefactories.BigFactory;
import creationalpatterns.abstractmethod.exampletwo.concretefactories.FamilyFactory;
import creationalpatterns.abstractmethod.exampletwo.concretefactories.SmallFactory;

public class Main {

    public static void main(String[] args) {
        final var bigFactory = new BigFactory();
        final var familyFactory = new FamilyFactory();
        final var smallFactory = new SmallFactory();

        System.out.println("-----------------------------------");

        final var bigFrenchFries = bigFactory.createFrenchFries();
        bigFrenchFries.execute();
        final var bigSandwich = bigFactory.createSandwich();
        bigSandwich.execute();

        System.out.println("-----------------------------------");
        final var smallFrenchFries = smallFactory.createFrenchFries();
        smallFrenchFries.execute();
        final var smallSandwich = smallFactory.createSandwich();
        smallSandwich.execute();

        System.out.println("-----------------------------------");
        final var familyFrenchFries = familyFactory.createFrenchFries();
        familyFrenchFries.execute();
        final var familySandwich = familyFactory.createSandwich();
        familySandwich.execute();
    }
}

package creationalpatterns.abstractmethod.exampletwo.concretefactories;

import creationalpatterns.abstractmethod.exampletwo.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.FamilyFrenchFries;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.FamilySandwich;

public class FamilyFactory implements AbstractFactory {

    @Override
    public Sandwich createSandwich() {
        System.out.println("Create a new family sandwich");
        return new FamilySandwich();
    }

    @Override
    public FrenchFries createFrenchFries() {
        System.out.println("Create a new family french fries");
        return new FamilyFrenchFries();
    }
}

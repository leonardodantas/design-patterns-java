package creationalpatterns.abstractmethod.exampletwo.concretefactories;

import creationalpatterns.abstractmethod.exampletwo.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.BigFrenchFries;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.BigSandwich;

public class BigFactory implements AbstractFactory {

    @Override
    public Sandwich createSandwich() {
        System.out.println("Create a new big sandwich");
        return new BigSandwich();
    }

    @Override
    public FrenchFries createFrenchFries() {
        System.out.println("Create a new big french fries");
        return new BigFrenchFries();
    }
}

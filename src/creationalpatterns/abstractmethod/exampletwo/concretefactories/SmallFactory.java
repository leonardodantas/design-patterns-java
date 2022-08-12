package creationalpatterns.abstractmethod.exampletwo.concretefactories;

import creationalpatterns.abstractmethod.exampletwo.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.SmallFrenchFries;
import creationalpatterns.abstractmethod.exampletwo.concreteproducts.SmallSandwich;

public class SmallFactory implements AbstractFactory {

    @Override
    public Sandwich createSandwich() {
        System.out.println("Create a new small sandwich");
        return new SmallSandwich();
    }

    @Override
    public FrenchFries createFrenchFries() {
        System.out.println("Create a new small french fries");
        return new SmallFrenchFries();
    }
}

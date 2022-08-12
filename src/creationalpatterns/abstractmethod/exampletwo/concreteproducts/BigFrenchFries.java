package creationalpatterns.abstractmethod.exampletwo.concreteproducts;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;

public class BigFrenchFries implements FrenchFries {

    @Override
    public void execute() {
        System.out.println("Creating a big French Fries");
    }
}

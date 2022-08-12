package creationalpatterns.abstractmethod.exampletwo.concreteproducts;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;

public class SmallFrenchFries implements FrenchFries {
    @Override
    public void execute() {
        System.out.println("Creating a small French Fries");
    }
}

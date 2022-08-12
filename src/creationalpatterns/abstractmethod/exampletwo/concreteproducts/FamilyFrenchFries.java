package creationalpatterns.abstractmethod.exampletwo.concreteproducts;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;

public class FamilyFrenchFries implements FrenchFries {
    @Override
    public void execute() {
        System.out.println("Creating a family French Fries");
    }
}

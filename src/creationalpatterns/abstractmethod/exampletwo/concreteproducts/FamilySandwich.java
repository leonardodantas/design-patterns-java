package creationalpatterns.abstractmethod.exampletwo.concreteproducts;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;

public class FamilySandwich implements Sandwich {
    @Override
    public void execute() {
        System.out.println("Create Family sandwich");
        System.out.println("3 Bread");
        System.out.println("2 Burger");
        System.out.println("4 Bacon");
        System.out.println("5 Cheese");
    }
}

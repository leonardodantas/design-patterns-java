package creationalpatterns.abstractmethod.exampletwo.concreteproducts;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;

public class SmallSandwich implements Sandwich {
    @Override
    public void execute() {
        System.out.println("Create Family sandwich");
        System.out.println("2 Bread");
        System.out.println("1 Burger");
        System.out.println("1 Cheese");
    }
}

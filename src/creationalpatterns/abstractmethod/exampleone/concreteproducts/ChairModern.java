package creationalpatterns.abstractmethod.exampleone.concreteproducts;

import creationalpatterns.abstractmethod.exampleone.abstractproducts.IChair;

public class ChairModern implements IChair {

    @Override
    public void execute() {
        System.out.println("Chair execute modern");
    }
}

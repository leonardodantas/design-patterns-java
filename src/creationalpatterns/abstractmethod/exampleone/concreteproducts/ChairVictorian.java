package creationalpatterns.abstractmethod.exampleone.concreteproducts;

import creationalpatterns.abstractmethod.exampleone.abstractproducts.IChair;

public class ChairVictorian implements IChair {

    @Override
    public void execute() {
        System.out.println("Chair execute victorian");
    }
}

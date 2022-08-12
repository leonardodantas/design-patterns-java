package creationalpatterns.abstractmethod.exampleone.concreteproducts;

import creationalpatterns.abstractmethod.exampleone.abstractproducts.ICouch;

public class CouchModern implements ICouch {

    @Override
    public void execute() {
        System.out.println("Couch execute modern");
    }
}

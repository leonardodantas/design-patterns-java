package creationalpatterns.abstractmethod.exampleone.concretefactories;

import creationalpatterns.abstractmethod.exampleone.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampleone.abstractproducts.IChair;
import creationalpatterns.abstractmethod.exampleone.abstractproducts.ICouch;
import creationalpatterns.abstractmethod.exampleone.concreteproducts.ChairModern;
import creationalpatterns.abstractmethod.exampleone.concreteproducts.CouchModern;

public class ModernFactory implements AbstractFactory {

    @Override
    public IChair createChair() {
        System.out.println("Create new chairModern");
        return new ChairModern();
    }

    @Override
    public ICouch createCouch() {
        System.out.println("Create new couchModern");
        return new CouchModern();
    }
}

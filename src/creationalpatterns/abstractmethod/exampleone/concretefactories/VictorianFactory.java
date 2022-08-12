package creationalpatterns.abstractmethod.exampleone.concretefactories;

import creationalpatterns.abstractmethod.exampleone.abstractfactory.AbstractFactory;
import creationalpatterns.abstractmethod.exampleone.abstractproducts.IChair;
import creationalpatterns.abstractmethod.exampleone.abstractproducts.ICouch;
import creationalpatterns.abstractmethod.exampleone.concreteproducts.ChairVictorian;
import creationalpatterns.abstractmethod.exampleone.concreteproducts.CouchVictorian;

public class VictorianFactory implements AbstractFactory {

    @Override
    public IChair createChair() {
        System.out.println("Create new chairVictorian");
        return new ChairVictorian();
    }

    @Override
    public ICouch createCouch() {
        System.out.println("Create new couchVictorian");
        return new CouchVictorian();
    }
}

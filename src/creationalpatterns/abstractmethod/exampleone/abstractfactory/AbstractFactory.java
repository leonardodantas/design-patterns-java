package creationalpatterns.abstractmethod.exampleone.abstractfactory;

import creationalpatterns.abstractmethod.exampleone.abstractproducts.IChair;
import creationalpatterns.abstractmethod.exampleone.abstractproducts.ICouch;

public interface AbstractFactory {

    IChair createChair();

    ICouch createCouch();
}

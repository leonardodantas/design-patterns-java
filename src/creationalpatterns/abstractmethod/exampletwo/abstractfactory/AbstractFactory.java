package creationalpatterns.abstractmethod.exampletwo.abstractfactory;

import creationalpatterns.abstractmethod.exampletwo.abstractproduct.FrenchFries;
import creationalpatterns.abstractmethod.exampletwo.abstractproduct.Sandwich;

public interface AbstractFactory {

    Sandwich createSandwich();
    FrenchFries createFrenchFries();
}

package creationalpatterns.builders.exampleone.abstractbuilder;

import creationalpatterns.builders.exampleone.abstractproduct.ICar;
import creationalpatterns.builders.exampleone.models.SportEngine;

public interface Builder {

    void reset();

    void seats(final int seats);

    void engine(final SportEngine sportEngine);

    void tripConsumer(final boolean tripConsumer);

    void GPS(final boolean gps);

    ICar getProduct();

}

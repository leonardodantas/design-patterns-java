package creationalpatterns.builders.exampleone.director;

import creationalpatterns.builders.exampleone.abstractbuilder.Builder;
import creationalpatterns.builders.exampleone.abstractproduct.ICar;
import creationalpatterns.builders.exampleone.concretebuilder.CarBuilder;
import creationalpatterns.builders.exampleone.models.Car;
import creationalpatterns.builders.exampleone.models.SportEngine;

public class Director {

    private final Builder builder;

    public Director(final Builder builder) {
        this.builder = builder;
    }

    public void constructSportCar() {
        builder.reset();
        builder.seats(2);
        builder.engine(new SportEngine());
        builder.tripConsumer(true);
        builder.GPS(true);
    }

    public void constructSUV() {
        builder.reset();
        builder.seats(4);
        builder.engine(new SportEngine());
        builder.tripConsumer(false);
        builder.GPS(true);
    }

    public ICar getProduct(){
        return builder.getProduct();
    }

}

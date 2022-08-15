package creationalpatterns.builders.exampleone.concretebuilder;

import creationalpatterns.builders.exampleone.abstractbuilder.Builder;
import creationalpatterns.builders.exampleone.abstractproduct.ICar;
import creationalpatterns.builders.exampleone.models.Car;
import creationalpatterns.builders.exampleone.models.SportEngine;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void seats(final int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void engine(final SportEngine sportEngine) {
        this.car.setSportEngine(sportEngine);
    }

    @Override
    public void tripConsumer(final boolean tripConsumer) {
        this.car.setTripConsumer(tripConsumer);
    }

    @Override
    public void GPS(final boolean gps) {
        this.car.setGps(gps);
    }

    @Override
    public ICar getProduct() {
        final var car = this.car;
        this.reset();
        return car;
    }

}

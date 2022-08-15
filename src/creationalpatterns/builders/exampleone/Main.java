package creationalpatterns.builders.exampleone;

import creationalpatterns.builders.exampleone.concretebuilder.CarBuilder;
import creationalpatterns.builders.exampleone.director.Director;
import creationalpatterns.builders.exampleone.models.SportEngine;

public class Main {

    public static void main(String[] args) {
        /**
         * construction of objects with builder
         */
        System.out.println("---------------------------------------");
        final var carBuilders = new CarBuilder();
        carBuilders.seats(1);
        carBuilders.tripConsumer(true);
        carBuilders.GPS(true);
        carBuilders.engine(new SportEngine());

        final var car = carBuilders.getProduct();
        System.out.println(car.toString());

        /**
         * construction of objects with builder and directors
         */
        System.out.println("---------------------------------------");
        final var carBuildersForDirector = new CarBuilder();
        final var director = new Director(carBuildersForDirector);
        director.constructSportCar();
        System.out.println("SportCar");
        final var sportCar = director.getProduct();
        System.out.println(sportCar.toString());

        director.constructSUV();
        System.out.println("SUV");
        final var suvCar = director.getProduct();
        System.out.println(suvCar.toString());
    }
}

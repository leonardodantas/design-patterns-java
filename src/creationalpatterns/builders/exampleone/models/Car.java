package creationalpatterns.builders.exampleone.models;

import creationalpatterns.builders.exampleone.abstractproduct.ICar;

public class Car implements ICar {

    private int seats;
    private SportEngine sportEngine;
    private boolean tripConsumer;
    private boolean gps;

    public void setSeats(final int seats) {
        this.seats = seats;
    }

    public void setSportEngine(final SportEngine sportEngine) {
        this.sportEngine = sportEngine;
    }

    public void setTripConsumer(final boolean tripConsumer) {
        this.tripConsumer = tripConsumer;
    }

    public void setGps(final boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", sportEngine=" + sportEngine +
                ", tripConsumer=" + tripConsumer +
                ", gps=" + gps +
                '}';
    }
}

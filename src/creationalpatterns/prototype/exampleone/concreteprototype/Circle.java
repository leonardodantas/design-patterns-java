package creationalpatterns.prototype.exampleone.concreteprototype;

import creationalpatterns.prototype.exampleone.abstractprototype.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle() {

    }

    public int getRadius() {
        return radius;
    }

    public Circle(final Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    public void setRadius(final int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

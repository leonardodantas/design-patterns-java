package creationalpatterns.prototype.exampleone;

import creationalpatterns.prototype.exampleone.abstractprototype.Shape;
import creationalpatterns.prototype.exampleone.concreteprototype.Circle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final var circle = new Circle();
        circle.setRadius(1);
        circle.setX(10);
        circle.setRadius(20);
        circle.setColor("RED");

        System.out.println("CIRCLE ORIGINAL");
        System.out.println(circle);

        final var circleClone = circle.clone();
        System.out.println("CIRCLE CLONE");
        System.out.println(circleClone.toString());

    }
}

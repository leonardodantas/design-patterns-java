package creationalpatterns.prototype.exampleone.concreteprototype;

import creationalpatterns.prototype.exampleone.abstractprototype.Shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public void setWidth(final int width) {
        this.width = width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(final Rectangle rectangle){
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}

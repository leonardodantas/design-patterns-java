package creationalpatterns.prototype.exampleone.abstractprototype;

public abstract class Shape {

    private int x;
    private int y;

    private String color;

    public Shape() {

    }

    public Shape(final Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract Shape clone();

}

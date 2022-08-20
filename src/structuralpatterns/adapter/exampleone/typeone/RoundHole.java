package structuralpatterns.adapter.exampleone.typeone;

public class RoundHole {

    private final int radius;

    public RoundHole(final int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isFits(final RoundPeg roundPeg){
        return this.getRadius() >= roundPeg.getRadius();
    }
}

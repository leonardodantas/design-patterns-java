package structuralpatterns.adapter.exampleone.adapter;

import structuralpatterns.adapter.exampleone.typeone.RoundPeg;
import structuralpatterns.adapter.exampleone.typetwo.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private final int radius;

    public SquarePegAdapter(final SquarePeg squarePeg) {
        super(Double.valueOf(squarePeg.getWidth() * Math.sqrt(2) / 2).intValue());
        this.radius = Double.valueOf(squarePeg.getWidth() * Math.sqrt(2) / 2).intValue();
    }

    @Override
    public int getRadius() {
        return radius;
    }
}

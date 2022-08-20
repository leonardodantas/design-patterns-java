package structuralpatterns.adapter.exampleone;

import structuralpatterns.adapter.exampleone.adapter.SquarePegAdapter;
import structuralpatterns.adapter.exampleone.typeone.RoundHole;
import structuralpatterns.adapter.exampleone.typeone.RoundPeg;
import structuralpatterns.adapter.exampleone.typetwo.SquarePeg;

public class Main {

    public static void main(String[] args) {
        final var roundHole = new RoundHole(50);
        final var roundPeg = new RoundPeg(20);

        System.out.println(roundHole.isFits(roundPeg));

        final var smallSquarePeg = new SquarePeg(20);
        final var bigSquarePeg = new SquarePeg(40);

        /**
         * the code below does not compile because it is not compatible
         */
        //System.out.println(roundHole.isFits(smallSquarePeg));

        /**
         * use of adapter
         */
        final var smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        final var bigSquarePegAdapter = new SquarePegAdapter(bigSquarePeg);

        System.out.println(roundHole.isFits(smallSquarePegAdapter));
        System.out.println(roundHole.isFits(bigSquarePegAdapter));
    }
}

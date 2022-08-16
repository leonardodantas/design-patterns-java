package creationalpatterns.prototype.exampletwo;

import creationalpatterns.prototype.exampletwo.concreteprototype.Lhasa;

public class Main {

    public static void main(String[] args) {
        final var lhasa = new Lhasa();
        lhasa.setAge(2);
        lhasa.setColor("Black");
        lhasa.setPedigree(true);
        lhasa.setName("Lama");

        System.out.println("Lhasa");
        System.out.println(lhasa.toString());

        final var lhasaClone = lhasa.clone();
        System.out.println("Lhasa clone");
        System.out.println(lhasaClone.toString());
    }
}

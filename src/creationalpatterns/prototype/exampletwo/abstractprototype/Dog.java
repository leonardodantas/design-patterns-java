package creationalpatterns.prototype.exampletwo.abstractprototype;

import creationalpatterns.prototype.exampletwo.concreteprototype.Lhasa;

public abstract class Dog {

    private String name;
    private String color;
    private boolean isPedigree;

    public Dog(){}
    public Dog(final Lhasa lhasa) {
        this.name = lhasa.getName();
        this.color = lhasa.getColor();
        this.isPedigree = lhasa.isPedigree();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public boolean isPedigree() {
        return isPedigree;
    }

    public void setPedigree(final boolean pedigree) {
        isPedigree = pedigree;
    }

    public abstract Dog clone();
}

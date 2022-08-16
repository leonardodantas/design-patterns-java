package creationalpatterns.prototype.exampletwo.concreteprototype;

import creationalpatterns.prototype.exampletwo.abstractprototype.Dog;

public class Lhasa extends Dog {

    private int age;

    public Lhasa(){

    }

    private Lhasa(final Lhasa lhasa){
        super(lhasa);
        this.age = lhasa.age;

    }
    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lhasa{" +
                "age=" + age +
                '}';
    }

    @Override
    public Dog clone() {
        return new Lhasa(this);
    }
}

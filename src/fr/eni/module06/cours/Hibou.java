package fr.eni.module06.cours;

public class Hibou implements IAnimal {
    @Override
    public void manger() {
        System.out.printf("Il picore");
    }

    @Override
    public void bois() {
        System.out.printf("Il bois avec sa langue");
    }

    @Override
    public void cri() {
        System.out.printf("Il hulule");
    }

    @Override
    public void dors() {
        System.out.printf("Il dors debout");

    }
}

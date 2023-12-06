package fr.eni.module06.cours;

public class Chien implements IAnimal {
    @Override
    public void manger() {
        System.out.printf("il croque");
    }

    @Override
    public void bois() {
        System.out.printf("il lape");

    }

    @Override
    public void cri() {
        System.out.println("il aboie");
    }

    @Override
    public void dors() {
        System.out.println("Couché à la niche");

    }
}

package fr.eni.module06.cours;

public class Moto extends Vehicule {

    public Moto(String marque) {
        super(marque);
    }

    @Override
    public int getNbRoues() {
        return 2;
    }
}

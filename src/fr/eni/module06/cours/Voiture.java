package fr.eni.module06.cours;

public class Voiture extends Vehicule {

    public Voiture(String marque) {
        super(marque);
    }

    @Override
    public int getNbRoues() {
        return 4;
    }
}

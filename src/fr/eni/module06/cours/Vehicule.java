package fr.eni.module06.cours;

public abstract class Vehicule {

    private final String marque;
    protected float vitesse;

    protected Vehicule(String marque) {
        this.marque = marque;
    }

    // Méthode abstraite
    public abstract int getNbRoues();

    // Méthode concrète

    public void reserverDateCT() {
        // ...
    }
}

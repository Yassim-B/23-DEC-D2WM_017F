package fr.eni.module06.cours;

public class Voiture extends Vehicule implements VehiculeInterface {

    public Voiture(String marque) {
        super(marque);
    }

    @Override
    public int getNbRoues() {
        return 4;
    }

    @Override
    public void accelerer(float deltaVitesse) {
        vitesse += deltaVitesse;
    }
}

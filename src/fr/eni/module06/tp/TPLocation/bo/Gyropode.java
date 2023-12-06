package fr.eni.module06.tp.TPLocation.bo;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {

    private static final double TARIF_LOCATION = 29.9;
    private int tailleMin;

    public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomieKM, int tailleMin) {
        super(marque, modele, dateAchat, autonomieKM);
        this.tailleMin = tailleMin;
    }

    @Override
    public String toString() {
        return String.format("%s [%dm%d min] ", super.toString(), tailleMin / 100, tailleMin % 100);
    }

    @Override
    public double getTarifLocationHeure() {
        return TARIF_LOCATION;
    }

}

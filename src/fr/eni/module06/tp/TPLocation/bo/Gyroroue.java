package fr.eni.module06.tp.TPLocation.bo;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {

    private static final double TARIF_LOCATION = 18.9;

    public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomieKM) {
        super(marque, modele, dateAchat, autonomieKM);
    }

    @Override
    public double getTarifLocationHeure() {
        return TARIF_LOCATION;
    }

}

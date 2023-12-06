package fr.eni.module06.tp.TPLocation.bo;

import java.time.LocalDate;

public class Velo extends Cycle {

    private static final double TARIF_LOCATION = 4.9;
    private int nbrVitesse;

    public Velo(String marque, String modele, LocalDate dateAchat, int nbrVitesse) {
        super(marque, modele, dateAchat);
        this.nbrVitesse = nbrVitesse;
    }

    public int getNbrVitesse() {
        return nbrVitesse;
    }

    public void setNbrVitesse(int nbrVitesse) {
        this.nbrVitesse = nbrVitesse;
    }


    @Override
    public String toString() {
        return String.format("%s %d vitesse%s", super.toString(), nbrVitesse,
                nbrVitesse > 1 ? "s" : ""
        );
    }

    @Override
    public double getTarifLocationHeure() {
        return TARIF_LOCATION;
    }


}

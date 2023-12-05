package fr.eni.module05.tp.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {

    private LocalTime heureDebut;
    private int duree;
    private Medecin medecin;

    /**
     * @param heureDebut
     * @param duree
     * @param medecin
     */
    public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    /**
     * 09:00 - 09:15 (15 minutes)
     */
    public void afficher() {

        System.out.printf("%s - %s (%d minutes)%n", this.heureDebut.format(
                        DateTimeFormatter.ofLocalizedTime(
                                FormatStyle.SHORT)),
                this.heureDebut.plusMinutes(this.duree),
                this.duree);


    }

    /**
     * @return the medecin
     */
    public Medecin getMedecin() {
        return medecin;
    }


}

package fr.eni.module05.tp.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Creneau {

    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecin;

    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;

        this.medecin.ajouterCreneau(this);
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public MedecinGeneraliste getMedecin() {
        return medecin;
    }

    public void setMedecin(MedecinGeneraliste medecin) {
        this.medecin = medecin;
    }

    public void afficher() {
        System.out.printf("%s - %s (%d minutes)%n",
                DateTimeFormatter.ofPattern("hh:mm").format(heureDebut),
                DateTimeFormatter.ofPattern("hh:mm").format(heureDebut.plusMinutes(this.duree)),
                this.duree
        );
    }
}

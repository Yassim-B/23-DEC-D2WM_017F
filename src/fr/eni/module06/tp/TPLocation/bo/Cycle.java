package fr.eni.module06.tp.TPLocation.bo;

import java.time.LocalDate;

public abstract class Cycle {

    protected String marque, modele;
    protected LocalDate dateAchat;

    public Cycle(String marque, String modele, LocalDate dateAchat) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }

    public int age() {
        return dateAchat.until(LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s (%d an%s)", getClass().getSimpleName(),
                marque, modele, age(), age() > 1 ? "s" : "");
    }


    public abstract double getTarifLocationHeure();


}

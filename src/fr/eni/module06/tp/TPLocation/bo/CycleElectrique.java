package fr.eni.module06.tp.TPLocation.bo;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle {

    protected int autonomieKM;

    public CycleElectrique(String marque, String modele, LocalDate dateAchat,
                           int autonomieKM) {
        super(marque, modele, dateAchat);
        this.autonomieKM = autonomieKM;
    }

    @Override
    public String toString() {
        return String.format("%s %d Km d'autonomie", super.toString(), autonomieKM);
    }


}

package fr.eni.module09.cours;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concession {

    private List<Voiture> voitures = new ArrayList<>();

    Concession() {
        Voiture renault = new Voiture();
        renault.setMarque("Renault");
        renault.setModele("Clio");

        Voiture peugeot = new Voiture();
        peugeot.setMarque("peugeot");
        peugeot.setModele("206");

        this.voitures.add(renault);
        this.voitures.add(peugeot);
    }

    public Iterator<Voiture> iterator() {
        return this.voitures.iterator();
    }
}

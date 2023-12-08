package fr.eni.module09.cours;

import fr.eni.module08.cours.JourDeLaSemaine;
import fr.eni.module08.cours.Personne;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList persons = new ArrayList();
        persons.add(new Personne());
        persons.add("Personne");
        persons.add(JourDeLaSemaine.JEUDI);

        // Exemple iterateur
        Concession c = new Concession();
        Iterator<Voiture> voitureIterator = c.iterator();

    }

}

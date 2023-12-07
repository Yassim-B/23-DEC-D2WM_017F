package fr.eni.module08.cours;

import static fr.eni.module08.cours.Civilite.*;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne();
        p.setNom("DUPONT");
        p.setPrenom("Marjolaine");
        p.setCivilite(MADAME);
        p.setCivilite(MONSIEUR);
        p.setCivilite(MADEMOISELLE);

        int numero = MADAME.getNumero();
        System.out.println(numero);

        JourDeLaSemaine lun = JourDeLaSemaine.LUNDI;
        JourDeLaSemaine mar = JourDeLaSemaine.MARDI;
        JourDeLaSemaine mer = JourDeLaSemaine.MERCREDI;
        JourDeLaSemaine jeu = JourDeLaSemaine.JEUDI;
        JourDeLaSemaine ven = JourDeLaSemaine.VENDREDI;
        JourDeLaSemaine sam = JourDeLaSemaine.SAMEDI;
        JourDeLaSemaine dim = JourDeLaSemaine.DIMANCHE;

        for (JourDeLaSemaine j : JourDeLaSemaine.values()) {
            System.out.println(j.getNumeroDeLaSemaine() + " : " + j.toString());
        }


    }
}

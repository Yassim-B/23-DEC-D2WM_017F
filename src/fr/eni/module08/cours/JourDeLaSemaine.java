package fr.eni.module08.cours;

public enum JourDeLaSemaine {
    LUNDI(1),
    MARDI(2),
    MERCREDI(3),
    JEUDI(4),
    VENDREDI(5),
    SAMEDI(6),
    DIMANCHE(7);


    private int numeroDeLaSemaine;

    JourDeLaSemaine(int numeroDeLaSemaine) {
        this.numeroDeLaSemaine = numeroDeLaSemaine;
    }

    public int getNumeroDeLaSemaine() {
        return numeroDeLaSemaine;
    }
}

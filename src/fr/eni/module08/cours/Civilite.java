package fr.eni.module08.cours;

public enum Civilite {
    MADAME("MME", 1),
    MADEMOISELLE("MLLE", 2),
    MONSIEUR("M", 3);

    private String abreviation;

    private int numero;

    Civilite(String abreviation, int numero) {
        this.abreviation = abreviation;
        this.numero = numero;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public int getNumero() {
        return numero;
    }
}

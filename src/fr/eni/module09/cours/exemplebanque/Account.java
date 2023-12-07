package fr.eni.module09.cours;

public class Account {

    private String nomProprietaire;

    private double solde;

    private char devise;

    public Account(String nomProprietaire, double solde, char devise) {
        this.nomProprietaire = nomProprietaire;
        this.solde = solde;
        this.devise = devise;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public char getDevise() {
        return devise;
    }

    public void setDevise(char devise) {
        this.devise = devise;
    }
}

package fr.eni.module09.cours.exemplebanque;

public class Account<T> {

    private String nomProprietaire;

    private double solde;

    private T devise;

    public Account(String nomProprietaire, double solde, T devise) {
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

    public void addMoney(int montant) {
        this.solde += montant;
    }

    public void removeMoney(int montant) {
        this.solde -= montant;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public T getDevise() {
        return devise;
    }

    public void setDevise(T devise) {
        this.devise = devise;
    }

    public void showBalance() {
        System.out.println("vous avez actuellement " + solde + " " + devise);
    }
}

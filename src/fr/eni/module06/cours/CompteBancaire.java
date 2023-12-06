package fr.eni.module06.cours;

public class CompteBancaire extends Compte {
    private final String numero;
    private int balance;

    public CompteBancaire(String numero) {
        this.numero = numero;
    }

    @Override
    public void deposer(int montant) {
        this.balance += montant;
    }

    @Override
    public int retirer(int montant) {
        if (balance < montant) {
            return this.balance -= montant;
        }
        return 0;
    }
    
}


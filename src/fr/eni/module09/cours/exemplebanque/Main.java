package fr.eni.module09.cours.exemplebanque;

public class Main {

    public static void main(String[] args) {
        Account comptePierre = new Account("Pierre", 100, '€');
        comptePierre.showBalance();
        Account compteFrancois = new Account("Francois", 1000, "euros");
        compteFrancois.showBalance();
    }
}

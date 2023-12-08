package fr.eni.module09.cours.exemplebanque;

public class Banque {

    private String name;

    public Banque(String name) {
        this.name = name;
    }

    // T doit forcément hériter de comparable
    public static <T extends Comparable<T>> T max(T element1, T element2) {
        T maximum = null;
        return maximum;
    }

    // retourner la devise (soit string, soit un char)
    // <String, Character> est la déclaration du type générique
    public <String, Character> Character transfert(Account<String> source, Account<Character> cible, int montant) throws Exception {

        // Si le montant de la source est au moins superieur ou égale au solde

        if (source.getSolde() >= montant) {
            source.removeMoney(montant);
            cible.addMoney(montant);
            System.out.println(source.getNomProprietaire() + " a envoyé " + montant + source.getDevise() + " à " + cible.getNomProprietaire());
        } else {
            throw new Exception("transaction Impossible");
        }
        return cible.getDevise();

    }

    public String getName() {
        return name;
    }
}

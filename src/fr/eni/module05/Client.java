package fr.eni.module05;

public class Client extends Personne{

    private String siret;
    public Client(String nom, String prenom, String siret) {
        super(nom, prenom);
        this.siret = siret;
    }

    @Override
    public void creer(Client c) {
        super.creer(c);
    }
}

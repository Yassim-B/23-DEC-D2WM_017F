package fr.eni.module05.tp.bo;

public class Personne {

    protected String nom;
    protected String prenom;
    protected String numeroDeTelephone;
    protected Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public void methodeDansPersonne() {

    }

    public void afficher() {
        System.out.println("Nom: " + this.nom + "\n"
                + "Prénom: " + this.prenom + "\n"
                + "Numéro de téléphone: " + this.numeroDeTelephone + "\n"
        );
    }

    public String getNom() {
        return nom;
    }


}

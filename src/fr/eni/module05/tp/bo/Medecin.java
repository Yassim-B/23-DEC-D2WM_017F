package fr.eni.module05.tp.bo;

public class Medecin extends Personne {


    protected static final int NB_CRENEAU_MAX = 15;
    protected Creneau[] creneaux = new Creneau[NB_CRENEAU_MAX];

    protected int nbCreneau = 0;

    public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }


    public void ajouterCreneau(Creneau c) {
        if (c.getMedecin() == this) {
            if (this.nbCreneau < NB_CRENEAU_MAX) {
                this.creneaux[this.nbCreneau] = c;
                this.nbCreneau++;
            } else {
                System.out.println("Tous les creneaux sont occupés");
            }
        } else {
            System.out.println("Le creneau que vous voulez "
                    + "ajouter appartient déjà à un autre médecin");
        }
    }

    public void afficher() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Téléphone : " + this.numeroDeTelephone);
        System.out.println("Adresse : ");
        this.adresse.afficher();
        System.out.println("Creneaux : ");
        for (int i = 0; i < this.nbCreneau; i++) {
            this.creneaux[i].afficher();
        }
    }

}

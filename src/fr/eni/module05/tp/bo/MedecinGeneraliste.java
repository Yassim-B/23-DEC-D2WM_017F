package fr.eni.module05.tp.bo;

import java.util.ArrayList;

public class MedecinGeneraliste {

    private static int tarif = 25;

    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private Adresse adresse;
    private ArrayList<Creneau> creneaux;

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
        this.creneaux = new ArrayList<>();
    }

    public static int getTarif() {
        return MedecinGeneraliste.tarif;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Creneau> getCreneaux() {
        return creneaux;
    }

    public void ajouterCreneau(Creneau creneau) {

        if (!creneau.getMedecin().equals(this)) {
            System.err.println("Ce créneau est attribué à un autre médecin");
            return;
        }

        if (this.creneaux.size() > 15) {
            System.err.println("Nombre de créneaux maximum !");
            return;
        }

        this.creneaux.add(creneau);
    }

    public void afficher() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Téléphone : " + this.numeroDeTelephone);
        System.out.println("Tarif : " + MedecinGeneraliste.tarif);
        System.out.println("Adresse : ");
        this.adresse.afficher();

        System.out.println("Créneaux");
        for (Creneau c : this.creneaux) {
            c.afficher();
        }
    }
}

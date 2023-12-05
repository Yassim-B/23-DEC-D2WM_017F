package fr.eni.module05.tp.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {
    private String nom;
    private String prenom;
    private String numeroDeTelephone;
    private char sexe;
    private long numeroDeSecuriteSociale;
    private LocalDate dateDeNaisscance;
    private String commentaire;
    private Adresse adresse;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecuriteSociale, LocalDate dateDeNaisscance, String commentaire, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.sexe = sexe;
        this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
        this.dateDeNaisscance = dateDeNaisscance;
        this.commentaire = commentaire;
        this.adresse = adresse;
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public long getNumeroDeSecuriteSociale() {
        return numeroDeSecuriteSociale;
    }

    public void setNumeroDeSecuriteSociale(long numeroDeSecuriteSociale) {
        this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
    }

    public LocalDate getDateDeNaisscance() {
        return dateDeNaisscance;
    }

    public void setDateDeNaisscance(LocalDate dateDeNaisscance) {
        this.dateDeNaisscance = dateDeNaisscance;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Téléphone : " + this.numeroDeTelephone);
        System.out.println("Sexe : " + (this.sexe == 'F' ? "Féminin" : "Masuclin"));
        System.out.println("Numéro de sécurité sociale : " + this.numeroDeSecuriteSociale);
        System.out.println("Date de naissance : " + DateTimeFormatter.ofPattern("dd MMMM yyyy").format(this.dateDeNaisscance));
        System.out.println("Commentaires : " + (this.commentaire == null ? "[Aucun Commentaire]" : this.commentaire));
        System.out.println("Adresse : ");
        this.adresse.afficher();
    }
}

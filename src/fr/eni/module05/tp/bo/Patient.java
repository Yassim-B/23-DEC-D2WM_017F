package fr.eni.module05.tp.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {

    private char sexe;
    private long numeroDeSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaires;


    /**
     * @param prenom
     * @param numeroDeTelephone
     * @param sexe
     * @param numeroDeSecuriteSociale
     * @param dateDeNaissance
     * @param commentaires
     * @paramdd nom
     */
    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroDeSecuriteSociale,
                   LocalDate dateDeNaissance, String commentaires, Adresse adresse) {

        super(nom, prenom, numeroDeTelephone, adresse);
        this.sexe = sexe;
        this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;
    }

    /**
     * VAMBUCE Hillary
     * Téléphone : 0123456789
     * Sexe : Féminin
     * Numéro de Sécurité sociale : 287060244010154
     * Date de naissance : 2 juin 1987
     * Commentaires : Allergie aux arachides
     */
    public void afficher() {
        StringBuilder sb = new StringBuilder(this.nom.toUpperCase())
                .append(" ")
                .append(this.prenom)
                .append("\n")
                .append("Téléphone : ")
                .append(this.numeroDeTelephone)
                .append("\n")
                .append("Sexe : ")
                .append(this.sexe == 'M' ? "Masculin" : "Féminin")
                .append("\n")
                .append("Numéro de Sécurité sociale : ")
                .append(this.numeroDeSecuriteSociale)
                .append("\n")
                .append("Date de naissance : ")
                .append(this.dateNaissance())
                .append("\n")
                .append("Commentaires : ")
                .append(this.commentaires != null ? this.commentaires : "[aucun commentaire]")
                .append("\nAdresse : ");

        System.out.println(sb.toString());
        this.adresse.afficher();

    }


    private String dateNaissance() {
        String s = this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        return s;
    }


}

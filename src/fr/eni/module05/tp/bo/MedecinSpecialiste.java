package fr.eni.module05.tp.bo;

public class MedecinSpecialiste extends Medecin {

    private String specialite;
    private int tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite,
                              int tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }


    public void afficher() {
        super.afficher();
        System.out.println("Tarif : " + this.tarif);
        System.out.println("Specialité: " + this.specialite);
    }


}

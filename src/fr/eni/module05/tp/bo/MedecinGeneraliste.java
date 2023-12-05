package fr.eni.module05.tp.bo;

public class MedecinGeneraliste extends Medecin {

    private static int tarif;

    /**
     * @param nom
     * @param prenom
     * @param numeroTelephone
     */
    public MedecinGeneraliste(String nom, String prenom, String numeroTelephone, Adresse adresse) {
        super(nom, prenom, numeroTelephone, adresse);
        MedecinGeneraliste.tarif = 25;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * MALALANICHE Mélanie
     * Téléphone : 02.28.03.17.28
     * Tarif : 25€
     */
    public void afficher() {
        super.afficher();
        super.methodeDansPersonne();
        System.out.println("Tarif : " + MedecinGeneraliste.tarif);
    }


}

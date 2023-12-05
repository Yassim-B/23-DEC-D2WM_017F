package fr.eni.module05.tp.bo;

public class Adresse {

    private String mentionsComplementaires;
    private int numero;
    private String complement;
    private String voie;
    private int codePostal;
    private String ville;

    /**
     * @param mentionsComplementaires
     * @param numero
     * @param complement
     * @param typeDeVoie
     * @param nomVoie
     * @param codePostal
     * @param ville
     */
    public Adresse(String mentionsComplementaires, int numero, String complement, String voie,
                   int codePostal, String ville) {
        this.mentionsComplementaires = mentionsComplementaires;
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    /**
     * @param numero
     * @param complement
     * @param voie
     * @param codePostal
     * @param ville
     */
    public Adresse(int numero, String complement, String voie, int codePostal, String ville) {
        this(null, numero, complement, voie, codePostal, ville);
    }

    public void afficher() {

        if (this.mentionsComplementaires != null) {
            System.out.println(this.mentionsComplementaires);
        }

        System.out.printf("%d%s %s%n%d %s%n",
                this.numero,
                this.complement != null ? this.complement : "",
                this.voie,
                this.codePostal,
                this.ville);

    }


}

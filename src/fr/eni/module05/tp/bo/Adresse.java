package fr.eni.module05.tp.bo;

public class Adresse {

    private int numero;
    private String complement;
    private String voie;
    private int codePostal;
    private String ville;
    private String mentionsComplementaires;

    public Adresse(String mentionsComplementaires, int numero, String complement, String voie, int codePostal, String ville) {
        this(numero, complement, voie, codePostal, ville);
        this.mentionsComplementaires = mentionsComplementaires;
    }

    public Adresse(int numero, String complement, String voie, int codePostal, String ville) {
        this.numero = numero;
        this.complement = complement;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMentionsComplementaires() {
        return mentionsComplementaires;
    }

    public void setMentionsComplementaires(String mentionsComplementaires) {
        this.mentionsComplementaires = mentionsComplementaires;
    }

    public void afficher() {

        if (this.mentionsComplementaires != null && !this.mentionsComplementaires.trim().isEmpty()) {
            System.out.println(this.mentionsComplementaires);
        }

        System.out.println(this.numero + (this.complement == null ? "" : complement) + " " + this.voie);
        System.out.printf("%05d %s%n", this.codePostal, this.ville);
    }
}

public class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    protected char sexe;


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void creer(Client c) {
        System.out.printf("%s %s est créé", this.nom, this.prenom);
    }
}

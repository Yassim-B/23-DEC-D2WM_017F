package fr.eni.module07.cours;

public class Main {

   /* public static void main(String[] args) {
        Heros aquaman = new Heros();
        try {
            if (aquaman == null) {
                System.out.println("Bug !");
                throw new NullPointerException("Aquaman ne peut pas être nul !");
            }

            boolean victoire = aquaman.combattre("Kronos");
            boolean planDejoue = aquaman.desamorcer("Bombe");

            if (!victoire || !planDejoue) {
                System.out.println("Défaite !");
                throw new FinDuMondeException();
            }
            aquaman.setPoseVictorieuse();
            System.out.println("Victoire !");
        } catch (FinDuMondeException e) {
            e.printStackTrace();
        }
    }*/

    // Calcul d'une division
    public static void main(String[] args) {
        int i = 3;
        int j = 0;

        try {
            int g = i / j;
        } catch (Exception e) {
            System.out.println("la division par zéro est impossible");
            e.printStackTrace();
        }

        System.out.println("Terminé");
    }

}

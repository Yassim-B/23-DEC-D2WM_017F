package fr.eni.module07.tp;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);


    // Saisir un nombre entier
    public static int saisirEntier() {
        String x = "0";
        // Créer un pog

        boolean isOk = false;
        do {
            try {

                // Afficher "Saisir un nombre entier"
                System.out.println("Saisir un nombre entier");
                x = scan.nextLine();
                int i = Integer.parseInt(x);
                isOk = true;
                return i;
                // Traiter le cas pi ma saisie n'est pas un nombre numérique
            } catch (NumberFormatException e1) {
                gererCasDepassementLorsDundouble(x);
            }
        } while (!isOk);
        return 0;
    }


    // Traiter le cas d'une saisie incorrecte en cas de dépassement
    public static void gererCasDepassementLorsDundouble(String x) {
        try {
            double l = Double.parseDouble(x);
            System.out.println("Dépassement");
        } catch (NumberFormatException e2) {
            System.err.println("Saisie incorrect, Réessayez....");
        }
    }

    public static void main(String[] args) {
        int valeur1 = saisirEntier();
        String msg = "" + valeur1;
        char operateur;
        do {
            System.out.println(msg);
            System.out.println("opérateur ? (+ - * / % ou q pour quitter)");
            operateur = scan.nextLine().charAt(0);

            int valeur2 = saisirEntier();
            msg = valeur1 + "" + operateur + "" + valeur2;
            try {
                switch (operateur) {
                    case '+': {
                        valeur1 = Operation.ajouter(valeur1, valeur2);
                        msg += "=" + valeur1;
                        break;
                    }
                    case '-': {
                        valeur1 = Operation.sub(valeur1, valeur2);
                        msg += "=" + valeur1;
                        break;
                    }
                    case '*': {
                        valeur1 = Operation.mult(valeur1, valeur2);
                        msg += "=" + valeur1;
                        break;
                    }
                    case '/': {
                        valeur1 = valeur1 / valeur2;
                        msg += "=" + valeur1;
                        break;
                    }
                    case '%': {
                        valeur1 = Operation.mod(valeur1, valeur2);
                        msg += "=" + valeur1;
                        break;
                    }
                    default: {
                        operateur = 'q';
                    }
                }
            } catch (DepassementCapaciteException e) {
                System.out.println(e.getMessage());
            }

        } while (operateur != 'q');

        System.out.println("Bye bye");

    }

}

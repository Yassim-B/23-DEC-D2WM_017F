package fr.eni.module07;

import java.util.Scanner;

import static fr.eni.module07.Operation.*;

public class Main {

    // Créer objet scanner
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        char operateur;

        do {

            int valeur = saisirEntier();
            String message = "";
            System.out.println("opérateur ? (+ - * / %)");
            operateur = scan.next().charAt(0);
            int v = saisirEntier();
            message = valeur + " " + operateur + " " + v + " = ";
            try {
                switch (operateur) {
                    case '+':
                        valeur = ajouter(valeur, v);
                        message += valeur;
                        break;
                    case '-':
                        valeur = soustraire(valeur, v);
                        message += valeur;
                        break;

                    case '*':
                        valeur = multiplier(valeur, v);
                        message += valeur;
                        break;

                    case '/':
                        valeur = valeur / v;
                        message += valeur;
                        break;

                    case '%':
                        valeur = valeur % v;
                        message += valeur;
                        break;
                }
            } catch (ArithmeticException e) {
                System.err.println("La division par zéro n'est pas autorisée");
            } catch (DepassementCapaciteException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(message);
        } while (operateur != 'q');

    }

    // méthode de saisie d'un nombre entier
    public static int saisirEntier() {
        String x = "0";
        int i = 0;
        // Créer un pog
        boolean isSaisieOk = false;
        do {
            try {

                System.out.println("Saisir un nombre entier");
                x = scan.next();

                String valMinInt = String.valueOf(Integer.MIN_VALUE);
                String valMaxInt = String.valueOf(Integer.MAX_VALUE);

                boolean isInRange = inRange(valMinInt, valMaxInt, x);
                if (!isInRange) {
                    throw new DepassementCapaciteException();
                }
                i = Integer.parseInt(x);
                isSaisieOk = true;
            } catch (NumberFormatException e) {
                if (e.getMessage().contains("For input String")) {
                    System.err.println("Saisie incorrecte. Réessayez...");
                }
            } catch (DepassementCapaciteException e) {
                System.err.println("La valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
            }

        } while (!isSaisieOk);
        return i;
    }

    /**
     * @param valMinInt : valeur int min
     * @param valMaxInt : valeur int max
     * @param ref       : valeur entrée
     * @return true si la valeur entrée est dans la fourchette entre a et b
     */
    private static boolean inRange(String valMinInt, String valMaxInt, String ref) {
        try {
            double refValue = Double.parseDouble(ref);
            return (refValue >= Integer.MIN_VALUE && refValue <= Integer.MAX_VALUE);
        } catch (NumberFormatException e) {
            return false;
        }

    }


}

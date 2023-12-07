package fr.eni.module07;

import java.util.Scanner;

public class Calculatrice {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char operateur;

        do {

            int valeur = saisirEntier();
            String message = "";
            //System.out.println(valeur);
            System.out.println("opérateur ? (+ - * / %)");
            operateur = sc.next().charAt(0);
            int v = saisirEntier();

            message = valeur + " " + operateur + " " + v + " = ";

            try {
                switch (operateur) {
                    case '+':
                        valeur = Operation.ajouter(valeur, v);
                        message += valeur;
                        break;
                    case '-':
                        valeur = Operation.soustraire(valeur, v);
                        message += valeur;
                        break;
                    case '*':
                        valeur = Operation.multiplier(valeur, v);
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
                message = "" + valeur;
            } catch (DepassementCapaciteException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(message);

        } while (operateur != 'q');
    }

    private static int saisirEntier() {
        boolean saisieOk = false;
        int i = 0;
        String val = "";

        while (!saisieOk) {
            try {
                System.out.println("Saisir un nombre entier");
                val = sc.next();

                String valMinInt = String.valueOf(Integer.MIN_VALUE);
                String valMaxInt = String.valueOf(Integer.MAX_VALUE);

                boolean isInRange = inRange(valMinInt, valMaxInt, val);
                if (!isInRange) {
                    throw new DepassementCapaciteException();
                }

                i = Integer.parseInt(val);
                saisieOk = true;
            } catch (NumberFormatException e) {
                if (e.getMessage().contains("For input string")) {
                    System.err.println("Saisie incorrecte. Réessayez...");
                }
            } catch (DepassementCapaciteException e) {
                System.err.println("La valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
            }
        }
        return i;
    }

    /**
     * @param a   : valeur int min
     * @param b   : valeur int max
     * @param ref : valeur entrée
     * @return true si la valeur entré est dans la fourchette entre a et b
     */
    public static boolean inRange(String a, String b, String ref) {

        return ref.compareToIgnoreCase(a) >= 0 && ref.compareToIgnoreCase(b) <= 0;
    }
}
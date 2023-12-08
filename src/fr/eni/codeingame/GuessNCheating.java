package fr.eni.codeingame;

import java.util.Scanner;

public class GuessNCheating {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int R = Integer.parseInt(in.nextLine());
        int start = 1, end = 100;

        // On itère à chaque tour du jeu
        for (int i = 0; i < R; i++) {

            // Lire la devinette en divisant la ligne d'entrée à chaque espace
            String[] guess = in.nextLine().split(" ");

            int bob = Integer.parseInt(guess[0]);
            String alice = guess[1] + " " + guess[2];

            // Ajustement de l'intervalle des valeurs possibles en fonctions de la réponse d'Alce.
            // Si elle dit "Too high", alors l'intervalle se réduit à la valeur de Bob -1
            // Si elle dit "Too high", alors l'intervalle se réduit à la valeur de Bob +1
            if (alice.equals("too high")) {
                end = Math.min(end, bob - 1);
            } else if (alice.equals("too low")) {
                start = Math.max(start, bob + 1);
            }

            // Vérifie si Alice triche, si l'intervalle est invalide (start>end)
            // ou si Alice dit righton, mais que la valeur de Bob n'est pas dans l'intervalle,
            // le programme affiche Alice cheated in round
            if (start > end || "right on".equals(alice) && !(start <= bob && end >= bob)) {
                System.out.println("Alice cheated in round " + (i + 1));
                System.exit(0);
            }

        }

        System.out.println("No evidence of cheating");

    }


}

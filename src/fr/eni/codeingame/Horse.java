package fr.eni.codeingame;

import java.util.Arrays;
import java.util.Scanner;

public class Horse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Récupération du premier cheval
        int N = in.nextInt();

        // Tableau pour stocker les puissances des chevaux
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            // Lecture des puissances des chevaux
            P[i] = in.nextInt();
        }


        // Tri par ordre croissant
        Arrays.sort(P);

        // Choix d'une valeur élevée pour le calcul de la différence
        int difference = 20000000;

        // Recherche de la différence entre les 2 puissances
        for (int i = 1; i < N; i++) {
            difference = Math.min(difference, P[i] - P[i - 1]);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(difference);
    }
}

package fr.eni.codeingame;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            String direction = "";
            //int remainingTurns = in.nextInt(); // Nombre de tours

            // Si la position de départ Y de thor est > a la position Y de l'éclair
            // Alors augmenter la position Y de thor
            // Direction le nord

            if (initialTy > lightY) {
                initialTy--;
                direction = "N";
            }

            // Si la position de départ Y de thor est < a la position Y de l'éclair
            // Alors augmenter la position Y de thor
            // Direction le sud
            else if (initialTy < lightY) {
                initialTy++;
                direction = "S";
            }
            // Si la position de départ X de thor est < a la position X de l'éclair
            // Alors augmenter la position X de thor
            // Direction l'est
            if (initialTx < lightX) {
                initialTx++;
                direction += "E";
            }

            // Si la position de départ X de thor est > a la position X de l'éclair
            // Alors augmenter la position X de thor
            // Direction l'ouest
            else if (initialTx > lightX) {
                initialTx--;
                direction += "W";
            }

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(direction);
        }
    }
}
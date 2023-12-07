package fr.eni.module07;

public class Operation {

    // Créer une méthode addition

    public static int ajouter(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a + (long) b;
        int intResultat = a + b;
        if (longResultat != intResultat) {
            throw new DepassementCapaciteException();
        }
        return a + b;
    }

    // Créer une méthode soustraction

    public static int soustraire(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a - (long) b;
        int intResultat = a - b;
        if (longResultat != intResultat) {
            throw new DepassementCapaciteException();
        }
        return a + b;
    }

    // Créer une méthode multiplication
    public static int multiplier(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a * (long) b;
        int intResultat = a * b;
        if (intResultat != longResultat) {
            throw new DepassementCapaciteException();
        }
        return a * b;
    }


}

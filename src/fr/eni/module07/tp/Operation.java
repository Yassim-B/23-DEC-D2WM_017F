package fr.eni.module07.tp;

public class Operation {

    public static int ajouter(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a + (long) b;
        int intResultat = a + b;
        if (intResultat != longResultat)
            throw new DepassementCapaciteException();
        return a + b;
    }

    public static int sub(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a - (long) b;
        int intResultat = a - b;
        if (intResultat != longResultat)
            throw new DepassementCapaciteException();
        return a - b;
    }

    public static int mult(int a, int b) throws DepassementCapaciteException {
        long longResultat = (long) a * (long) b;
        int intResultat = a * b;
        if (intResultat != longResultat)
            throw new DepassementCapaciteException();
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

}

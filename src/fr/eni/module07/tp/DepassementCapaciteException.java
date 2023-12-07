package fr.eni.module07.tp;

public class DepassementCapaciteException extends Exception {


    public DepassementCapaciteException() {
        super("Le résultat dépasse la capacité de la calculatrice");
    }

}

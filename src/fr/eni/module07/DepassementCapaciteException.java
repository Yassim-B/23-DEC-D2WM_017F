package fr.eni.module07;

public class DepassementCapaciteException extends Exception {

    public DepassementCapaciteException() {
        super("Le résultat dépasse la capacité de la calculatrice");
    }

    public DepassementCapaciteException(String value) {
        super(value);
    }
}

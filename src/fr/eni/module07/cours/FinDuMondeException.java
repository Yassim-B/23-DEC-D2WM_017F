package fr.eni.module07.cours;

import java.time.Instant;

public class FinDuMondeException extends Exception {

    private Instant date;

    public FinDuMondeException() {
        this(Instant.now());
    }

    public FinDuMondeException(Instant date) {
        super("La fin du monde est survenue le " + date);
        this.date = date;
    }

    public Instant getDate() {
        return date;
    }
}

package ru.mera.atuzhil.task3;

public class PaperMessage extends Message {
    private String fromPostalIndex;
    private String toPostalIndex;

    public PaperMessage(Person from, Person to, String message, String fromPostalIndex, String toPostalIndex) {
        super(from, to, message);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }

    public String getFromPostalIndex() {
        return this.fromPostalIndex;
    }

    public String getToPostalIndex() {
        return this.toPostalIndex;
    }
}
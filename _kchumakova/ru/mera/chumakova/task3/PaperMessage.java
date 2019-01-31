package ru.mera.chumakova.task3;

public class PaperMessage extends Message{
    private int fromPostalIndex;
    private int toPostalIndex;

    PaperMessage (Person from, Person to, String message, int fromPostalIndex, int toPostalIndex) {
        super(from, to, message);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }

    public int getFromPostalIndex() {
        return fromPostalIndex;
    }

    public int getToPostalIndex() {
        return toPostalIndex;
    }
}

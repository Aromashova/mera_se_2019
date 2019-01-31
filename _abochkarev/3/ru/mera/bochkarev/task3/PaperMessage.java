package ru.mera.bochkarev.task3;

public class PaperMessage extends Message {
    private String fromPostalIndex;
    private String toPostalIndex;

    PaperMessage(Person from, Person to, String message, String fromPostalIndex, String toPostalIndex) {
        super(from, to, message);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }

    public String getFromPostalIndex() {
        return fromPostalIndex;
    }

    public String getToPostalIndex() {
        return toPostalIndex;
    }

    @Override
    public String toString() {
        return "\nFrom: " + getFrom().toString()
                + "\nTo: " + getTo().toString()
                + "\nMessage: " + getMessage()
                + "\n\nFrom postal index " + fromPostalIndex
                + "\nTo postal index: " + toPostalIndex + "\n";

    }
}
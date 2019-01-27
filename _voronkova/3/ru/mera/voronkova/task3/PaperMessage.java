package ru.mera.voronkova.task3;

/**
 * Создать два подкласса Message: EmailMessage, PaperMessage
 * В PaperMessage должны быть поля from, to, message,   fromPostalIndex, toPostalIndex
 */

public class PaperMessage extends Message {
    private String fromPostalIndex;
    private  String toPostalIndex;

    public PaperMessage(Person from, Person to, String message, String fromPostalIndex, String toPostalIndex) {
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
        return "PaperMessage: \n" +
                ", from: " + getFrom() +
                ", to: " + getTo() +
                ", message: " + getMessage() + '\'' +
                ", Postal Index from: " + fromPostalIndex +
                ", PostalIndex to: " + toPostalIndex + "\'\n";
    }
}

package ru.mera.grishina.task3;

public class PaperMessage extends Message {
    int fromPostalIndex;
    int toPostalIndex;

    public PaperMessage(int fromPostalIndex, int toPostalIndex, String from, String to, String message) {
        super(from, to, message);
        this.fromPostalIndex = fromPostalIndex;
        this.toPostalIndex = toPostalIndex;
    }

    @Override
    public String toString() {
        return "EmailMessage{" + "From Postal Index = " + fromPostalIndex + ", To Postal Index = " + toPostalIndex + ", From = '" + getFrom() + '\'' + ", To = '" + getTo() + '\''
                + ", Message = '" + getMessage() + '\'' + '}';
    }
}
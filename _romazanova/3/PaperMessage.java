package ru.mera.romazanova.task3;

public class PaperMessage extends Message {

    private final String fromPostalIndex;
    private final String toPostalIndex;
    public PaperMessage(String from, String to, String message, String fromPostalIndex,
        String toPostalIndex) {
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
    public String toString (){
        return super.toString() + " " + fromPostalIndex + " " + toPostalIndex;
    }
}

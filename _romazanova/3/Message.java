package ru.mera.romazanova.task3;

public class Message {

    private final String from;
    private final String to;
    private final String message;
    public Message(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public String getMessage() {
        return message;
    }

    public String toString (){
        return from + " " + to + " " + message + " ";
    }
}

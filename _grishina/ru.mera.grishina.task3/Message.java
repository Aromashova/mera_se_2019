package ru.mera.grishina.task3;

public abstract class Message {
    private String from;
    private String to;
    private String message;

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

    @Override
    public String toString() {
        return String.format("From:%s, To:%s,Message:%s", from, to, message);
    }
}

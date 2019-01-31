package ru.mera.chumakova.task3;

public class Message {
    private Person from;
    private Person to;
    private String message;

    Message(Person from, Person to, String message) {
        this.from=from;
        this.to = to;
        this.message = message;
    }

    public Person getFrom() {
        return from;
    }

    public Person getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }
}

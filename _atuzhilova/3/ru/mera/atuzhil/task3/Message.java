package ru.mera.atuzhil.task3;

public class Message {
    private Person from;
    private Person to;
    private String message;

    public Message(Person from, Person to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public Person getFrom() {
        return this.from;
    }

    public Person getTo() {
        return this.to;
    }

    public String getMessage() {
        return this.message;
    }
}

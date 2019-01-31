package ru.mera.bochkarev.task3;

public class Message {
    private Person from;
    private Person to;
    private String message;

    Message(Person from, Person to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    Person getFrom() {
        return from;
    }

    Person getTo() {
        return to;
    }

    String getMessage() {
        return message;
    }
}

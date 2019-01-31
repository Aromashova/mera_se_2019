package ru.mera.bochkarev.task3;

import java.time.LocalDateTime;

public class EmailMessage extends Message {
    private LocalDateTime sendDate;
    private LocalDateTime receiveDate;

    EmailMessage(Person from, Person to, String message) {
        super(from, to, message);
        this.sendDate = LocalDateTime.now();
        this.receiveDate = LocalDateTime.now().plusMinutes(1);
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    @Override
    public String toString() {
        return "\nFrom: " + getFrom().toString()
                + "\nTo: " + getTo().toString()
                + "\nMessage: " + getMessage()
                + "\n\nSend date: " + sendDate
                + "\nReceive date: " + receiveDate + "\n";

    }
}

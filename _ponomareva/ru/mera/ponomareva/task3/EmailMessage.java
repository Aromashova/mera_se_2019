package ru.mera.ponomareva.task3;

import java.time.LocalDateTime;

public class EmailMessage extends Message {

    private LocalDateTime sendDate;
    private LocalDateTime receiveDate;

    public EmailMessage(Person from, Person to, String message, LocalDateTime sendDate, LocalDateTime receiveDate) {
        super(from, to, message);
        this.sendDate = sendDate;
        this.receiveDate = receiveDate;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }
}

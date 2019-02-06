package ru.mera.ponomareva;

import java.time.LocalDateTime;

public class EmailMessage extends Message {

    private LocalDateTime sendDate;
    private LocalDateTime recieveDate;

    public EmailMessage(Person from, Person to, String message, LocalDateTime sendDate, LocalDateTime receiveDate) {
        super(from, to, message);
        this.sendDate = sendDate;
        this.recieveDate = recieveDate;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public LocalDateTime getRecieveDate() {
        return recieveDate;
    }
}

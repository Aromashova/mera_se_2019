package ru.mera.voronkova.task3;

import java.time.LocalDateTime;

/**
 * Создать два подкласса Message: EmailMessage, PaperMessage
 * В EmailMessage должны быть поля from, to, message, send date, receive date.
 */
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

    @Override
    public String toString() {
        return "EmailMessage: \n" +
                "sendDate " + sendDate +
                ", receiveDate " + receiveDate +
                ", from: " + getFrom().toString() +
                ", to: " + getTo().toString() +
                ", message: '" + getMessage() + "\'\n";
    }
}

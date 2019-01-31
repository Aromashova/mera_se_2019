package ru.mera.grishina.task3;

import java.time.LocalDateTime;

public class EmailMessage extends Message {
    LocalDateTime send_date;
    LocalDateTime receive_date;

    public EmailMessage(LocalDateTime send_date, LocalDateTime receive_date, String from, String to, String message) {
        super(from, to, message);
        this.send_date = send_date;
        this.receive_date = receive_date;
    }

    @Override
    public String toString() {
        return "EmailMessage{" + "Send Date = " + send_date + ", Receive Date = " + receive_date + ", From = '" + getFrom() + '\'' + ", To = '" + getTo() + '\''
                + ", Message = '" + getMessage() + '\'' + '}';
    }
}

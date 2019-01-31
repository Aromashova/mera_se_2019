package ru.mera.chumakova.task3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MailBox {
    EmailMessage[] emailMessages = new EmailMessage[3];
    PaperMessage[] paperMessages = new PaperMessage[3];

    public void addEmailMessage(Person from, Person to, String message, LocalDateTime sendDate) {
        EmailMessage emessage = new EmailMessage(from, to, message, sendDate, LocalDateTime.now());
        checkEmailCapacity();
        for(int i = 0; i< emailMessages.length; i++) {
            if (emailMessages[i] == null) {
                emailMessages[i] = emessage;
                break;
            }
        }
    }

    public void addPaperMessage(Person from, Person to, String message, int fromPostalIndex, int toPostalIndex) {
        PaperMessage pmessage  = new PaperMessage(from, to, message, fromPostalIndex, toPostalIndex);
        checkPaperCapacity();
        for (int i=0; i<paperMessages.length; i++) {
            if(paperMessages[i] == null) {
                paperMessages[i] = pmessage;
                break;
            }
        }
    }

    public void checkEmailCapacity () {
        boolean full = true;
        for (EmailMessage message : emailMessages) {
            if (message == null) {
                full = false;
                break;
            }
        }
        if(full) {
            emailMessages = Arrays.copyOf(emailMessages, emailMessages.length * 2);
            System.out.println("New emailBox length=" + emailMessages.length);
        }
    }

    public void checkPaperCapacity () {
        boolean full = true;
        for (PaperMessage message : paperMessages) {
            if (message == null) {
                full = false;
                break;
            }
        }
        if(full) {
            paperMessages = Arrays.copyOf(paperMessages, paperMessages.length * 2);
            System.out.println("New paperBox length=" + paperMessages.length);
        }
    }

    public void getEmailMessages() {
        for (EmailMessage message : emailMessages) {
            if (message != null) {
                System.out.println("From: " + message.getFrom().getName()+ ", " + message.getFrom().getSurname()
                        + "; To: " + message.getTo().getName()+ ", " + message.getTo().getSurname()
                        + "; Message: " + message.getMessage()
                        + "; Send date: " + message.getSendDate()
                        + "; Receive date: " + message.getReceiveDate());
            } else {
                break;
            }
        }
    }

    public void getPaperMessages() {
        for (PaperMessage message : paperMessages) {
            if (message != null) {
                System.out.println("From: " + message.getFrom().getName()+ ", " + message.getFrom().getSurname()
                        + "; To: " + message.getTo().getName()+ ", " + message.getTo().getSurname()
                        + "; Message: " + message.getMessage()
                        + "; From postal index: " + message.getFromPostalIndex()
                        + "; To postal index: " + message.getToPostalIndex());
            } else {
                break;
            }
        }
    }
}

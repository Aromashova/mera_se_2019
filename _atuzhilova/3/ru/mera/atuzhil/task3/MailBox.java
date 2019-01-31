package ru.mera.atuzhil.task3;

public class MailBox {
    private static int START_CAPACITY = 100;
    private static int ADDITIONAL = 100;

    private EmailMessage[] emailMessages = new EmailMessage[START_CAPACITY];
    private PaperMessage[] paperMessages = new PaperMessage[START_CAPACITY];
    private int indexEmails = 0;
    private int indexPapers = 0;

    public void addEmailMessage(EmailMessage msg) {
        if (msg == null) {
            System.out.println("Ignore  null  message");
            return;
        }

        if (indexEmails == emailMessages.length) {
            EmailMessage[] tempArray = new EmailMessage[emailMessages.length + ADDITIONAL];
            System.arraycopy(emailMessages, 0, tempArray, 0, emailMessages.length);
            emailMessages = tempArray;
        }
        emailMessages[indexEmails++] = msg;
    }

    public void addPaperMessage(PaperMessage msg) {
        if (msg == null) {
            System.out.println("Ignore null message");
            return;
        }

        if (indexPapers == paperMessages.length) {
            PaperMessage[] tempArray = new PaperMessage[paperMessages.length + ADDITIONAL];
            System.arraycopy(paperMessages, 0, tempArray, 0, paperMessages.length);
            paperMessages = tempArray;
        }
        paperMessages[indexPapers++] = msg;
    }

    public EmailMessage[] getEmailMessages() {
        return this.emailMessages;
    }

    public PaperMessage[] getPaperMessages() {
        return this.paperMessages;
    }
}
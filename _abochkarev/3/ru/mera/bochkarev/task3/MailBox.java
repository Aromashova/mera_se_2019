package ru.mera.bochkarev.task3;

public class MailBox {
    private EmailMessage[] emailMessages;
    private PaperMessage[] paperMessages;
    private int emailMessagesIndex;
    private int paperMessagesIndex;

    MailBox(int emailMessagesSize, int paperMessagesSize) {
        this.emailMessagesIndex = 0;
        this.paperMessagesIndex = 0;
        this.emailMessages = new EmailMessage[emailMessagesSize];
        this.paperMessages = new PaperMessage[paperMessagesSize];
    }

    void addEmailMessage(EmailMessage emailMessage) {
        if (emailMessagesIndex < emailMessages.length) {
            emailMessages[emailMessagesIndex] = emailMessage;
            emailMessagesIndex++;
        } else {
            EmailMessage[] arrayExtendsEmailMessages = new EmailMessage[emailMessages.length * 2];
            System.arraycopy(emailMessages, 0, arrayExtendsEmailMessages, 0, emailMessages.length);
            emailMessages = arrayExtendsEmailMessages;
            emailMessages[emailMessagesIndex] = emailMessage;
            emailMessagesIndex++;
        }
    }

    EmailMessage[] getEmailMessages() {
        return emailMessages;
    }

    void addPaperMessage(PaperMessage paperMessage) {
        if (paperMessagesIndex < paperMessages.length) {
            paperMessages[paperMessagesIndex] = paperMessage;
            paperMessagesIndex++;
        } else {
            PaperMessage[] arrayExtendsPaperMessages = new PaperMessage[paperMessages.length * 2];
            System.arraycopy(paperMessages, 0, arrayExtendsPaperMessages, 0, paperMessages.length);
            paperMessages = arrayExtendsPaperMessages;
            paperMessages[paperMessagesIndex] = paperMessage;
            paperMessagesIndex++;
        }
    }

    PaperMessage[] getPaperMessages() {
        return paperMessages;
    }
}

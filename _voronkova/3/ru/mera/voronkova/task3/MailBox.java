package ru.mera.voronkova.task3;

/**
 * Создайте класс MailBox в котором есть два массива для хранения сообщений – обычных и электронных.
 * В классе MailBox есть 4 метода: добавить сообщение обычное, электронное, получить все обычные сообщения,
 * получить все электронные сообщения.
 * Массивы должны «вырастать», если емкость существующего массива заканчивается.
 * Можете использовать System.arrayCopy для этого
 * https://www.tutorialspoint.com/java/lang/system_arraycopy.htm
 *
 * Для работы с датами рекомендуется использовать класс LocalDateTime.
 * https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant
 *
 */
import java.lang.System;

public class MailBox {
    private EmailMessage [] emailMessages;
    private PaperMessage [] paperMessages;
    private int emailStartIndex;
    private int paperStartIndex;
    private static int counter;

    public MailBox() {
        this.emailMessages = new EmailMessage[counter];
        this.paperMessages = new PaperMessage[counter];
        this.emailStartIndex = 0;
        this.paperStartIndex = 0;
        counter++;
    }

    public void addEmailMessage(EmailMessage email){
        if (emailStartIndex<emailMessages.length){
            emailMessages[emailStartIndex]=email;
            emailStartIndex++;
        }
        else{
            EmailMessage[] increasedArrayForEmailMessages = new EmailMessage[emailMessages.length+counter];
            System.arraycopy(emailMessages, 0, increasedArrayForEmailMessages, 0, emailMessages.length);
            emailMessages = increasedArrayForEmailMessages;
            emailMessages[emailStartIndex] = email;
            emailStartIndex++;
        }
    }


    public void addPaperMessage(PaperMessage paper){
        if (paperStartIndex<paperMessages.length){
            paperMessages[paperStartIndex]=paper;
            paperStartIndex++;
        }
        else{
            PaperMessage[] increasedArrayForPaperMessages = new PaperMessage[paperMessages.length+counter];
            System.arraycopy(paperMessages, 0, increasedArrayForPaperMessages, 0, paperMessages.length);
            paperMessages = increasedArrayForPaperMessages;
            paperMessages[paperStartIndex] = paper;
            paperStartIndex++;
        }
    }

    public EmailMessage[] getEmailMessages() {
        return emailMessages;
    }

    public PaperMessage[] getPaperMessages() {
        return paperMessages;
    }
}

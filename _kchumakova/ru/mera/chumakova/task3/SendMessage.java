package ru.mera.chumakova.task3;

import java.time.LocalDateTime;

public class SendMessage {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        /*Person sender1 = new Person("SenderName1", "SenderSurname1");
        Person sender2 = new Person("SenderName2", "SenderSurname2");
        Person sender3 = new Person("SenderName3", "SenderSurname3");
        Person sender4 = new Person("SenderName4", "SenderSurname4");
        Person sender5 = new Person("SenderName5", "SenderSurname5");

        Person receiver1 = new Person("ReceiverName1", "ReceiverSurname1");
        Person receiver2 = new Person("ReceiverName2", "ReceiverSurname2");
        Person receiver3 = new Person("ReceiverName3", "ReceiverSurname3");
        Person receiver4 = new Person("ReceiverName4", "ReceiverSurname4");
        Person receiver5 = new Person("ReceiverName5", "ReceiverSurname5");

        mailBox.addEmailMessage(sender1, receiver1, "hello!", LocalDateTime.now());
        mailBox.addEmailMessage(sender2, receiver2, "hello!", LocalDateTime.now());
        mailBox.addEmailMessage(sender3, receiver3, "hello!", LocalDateTime.now());
        mailBox.addEmailMessage(sender4, receiver4, "hello!", LocalDateTime.now());

        mailBox.addPaperMessage(sender1, receiver1, "hello!", 0, 0);
        mailBox.addPaperMessage(sender2, receiver2, "hello!", 1, 1);
        mailBox.addPaperMessage(sender3, receiver3, "hello!", 2, 2);
        mailBox.addPaperMessage(sender4, receiver4, "hello!", 3, 3);
        mailBox.addPaperMessage(sender5, receiver5, "hello!", 4, 4);*/

        for(int i=0; i<5; i++) {
            Person sender = new Person("SenderName"+i, "SenderSurname"+i);
            Person receiver = new Person("ReceiverName"+i, "ReceiverSurname"+i);

            mailBox.addEmailMessage(sender, receiver, "hello!", LocalDateTime.now());
            mailBox.addPaperMessage(sender, receiver, "hello!", 0, 0);
        }

        mailBox.getEmailMessages();
        System.out.println("/**************************************************************************************/");
        mailBox.getPaperMessages();
    }
}

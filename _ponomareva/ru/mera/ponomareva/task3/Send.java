package ru.mera.ponomareva.task3;

import java.time.LocalDateTime;

public class Send {
    public static void main(String[] args){
        MailBox mailBox = new MailBox();

        Person sendPerson1 = new Person("Adam", "Smith");
        Person sendPerson2 = new Person("John", "Brain");
        Person sendPerson3 = new Person("July", "Holmes");

        Person receivePerson1 = new Person("John", "Brain");
        Person receivePerson2 = new Person("July", "Holmes");
        Person receivePerson3 = new Person("Adam", "Smith");

        mailBox.addEmailMessage(sendPerson1, receivePerson1, "First email", LocalDateTime.now(), LocalDateTime.now().plusMinutes(5));
        mailBox.addEmailMessage(sendPerson2, receivePerson2, "Second email", LocalDateTime.now(), LocalDateTime.now().plusMinutes(5));
        mailBox.addEmailMessage(sendPerson3, receivePerson3, "Third email", LocalDateTime.now(), LocalDateTime.now().plusMinutes(5));

        mailBox.addPaperMessage(sendPerson1, receivePerson1, "First paper message", 123456, 951753);
        mailBox.addPaperMessage(sendPerson2, receivePerson2, "Second paper message", 987456, 654321);
        mailBox.addPaperMessage(sendPerson3, receivePerson3, "Third paper message", 369852, 147852);

        mailBox.receiveAllEmailMessages();
        mailBox.receiveAllPaperMessages();
    }
}

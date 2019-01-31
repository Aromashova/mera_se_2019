package ru.mera.grishina.task3;

import java.time.LocalDateTime;

public class Person {
    public static void main ( String [] args ){
        MailBox mb = new MailBox();
        LocalDateTime now = LocalDateTime.now();

        EmailMessage email_1 = new EmailMessage(now, now.plusMinutes(1), "Brad Pitt", "Angelina Jolie", "Hello Beautiful!");
        mb.addEmail(email_1);

        EmailMessage email_2 = new EmailMessage(now.plusMinutes(1), now.plusMinutes(2), "Angelina Jolie", "Brad Pitt", "Leave me alone.");
        mb.addEmail(email_2);

        EmailMessage email_3 = new EmailMessage(now.plusMinutes(2), now.plusMinutes(3), "Brad Pitt", "Angelina Jolie", "Come on :)");
        mb.addEmail(email_3);

        PaperMessage letter_1 = new PaperMessage(603057, 603104, "Alex", "Irina", "Let's go to the cinema?");
        mb.addLetter(letter_1);

        PaperMessage letter_2 = new PaperMessage(603104, 603057, "Irina", "Alex", "Yes, of course!");
        mb.addLetter(letter_2);

        mb.getAllEmails();

        mb.getAllLetters();
    }

    /*private	final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }*/
}

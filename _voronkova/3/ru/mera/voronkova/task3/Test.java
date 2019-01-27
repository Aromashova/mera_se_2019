package ru.mera.voronkova.task3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MailBox mailBox=new MailBox();
        LocalDateTime now = LocalDateTime.now();

        mailBox.addEmailMessage(new EmailMessage(new Person("Kristina","Voronkova"),new Person("Andrey", "Tarasov"),"I have done my task3",now,now.plusMinutes(2)));
        mailBox.addEmailMessage(new EmailMessage(new Person("Andrey","Tarasov"),new Person("Kristina", "Voronkova"),"Ok. I will check it.",now,now.plusMinutes(2)));
        mailBox.addEmailMessage(new EmailMessage(new Person("Kristina","Voronkova"),new Person("Andrey", "Tarasov"),"I am waiting for merge ",now,now.plusMinutes(2)));

        System.out.println(Arrays.toString(mailBox.getEmailMessages()));

        mailBox.addPaperMessage(new PaperMessage(new Person("Kristina", "Voronkova"), new Person("Andrey", "Tarasov"), "I have done my task3", "420021", "603140"));
        mailBox.addPaperMessage(new PaperMessage(new Person("Andrey", "Tarasov"), new Person("Kristina", "Voronkova"), "Ok. I will check it.", "603140", "420021"));
        mailBox.addPaperMessage(new PaperMessage(new Person("Kristina", "Voronkova"), new Person("Andrey", "Tarasov"), "I am waiting for merge ", "420021", "603140"));
        System.out.println(Arrays.toString(mailBox.getPaperMessages()));
    }
}

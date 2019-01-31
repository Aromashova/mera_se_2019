package ru.mera.bochkarev.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox(2, 1);

        //---- Creating several e-mail messages ----//
        mailBox.addEmailMessage(new EmailMessage(
                new Person("James", "Cooper "),
                new Person("Dan", "Brown"),
                "Hi Dan!"));

        mailBox.addEmailMessage(new EmailMessage(
                new Person("Dan", "Brown "),
                new Person("James", "Cooper"),
                "Hi James! What are you writing now?"));

        mailBox.addEmailMessage(new EmailMessage(
                new Person("James", "Cooper "),
                new Person("Dan", "Brown"),
                "I'm writing a new masterpiece ;)"));

        mailBox.addEmailMessage(new EmailMessage(
                new Person("Dan", "Brown "),
                new Person("James", "Cooper"),
                "You are an optimist LOL"));

        //---- Show e-mail messages array ----//
        System.out.println(Arrays.toString(mailBox.getEmailMessages()));
        System.out.println("// =================================================== //");

        //---- Creating several paper messages ----//
        mailBox.addPaperMessage(new PaperMessage(
                new Person("Luke", ""),
                new Person("Max", ""),
                "Do",
                "108841",
                "690001"));

        mailBox.addPaperMessage(new PaperMessage(
                new Person("Max", ""),
                new Person("Luke", ""),
                "Du hast",
                "690001",
                "108841"));

        mailBox.addPaperMessage(new PaperMessage(
                new Person("Luke", ""),
                new Person("Max", ""),
                "Du hast mich",
                "108841",
                "690001"));

        //---- Show paper messages array ----//
        System.out.println(Arrays.toString(mailBox.getPaperMessages()));

    }
}

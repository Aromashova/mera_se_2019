package ru.mera.romazanova.task3;

public class Person {

    public static void main(String[] args) {
        final int testValue = 10; // This value may be set another
        final MailBox mailBox = new MailBox();
        for (int i = 0; i < testValue; i++) {
            mailBox.addEmailMessageToBox(
                new EmailMessage("Moskva" + i, "NN" + (testValue - i),
                    "message", "senddata", "receivedate"));
        }
        mailBox.printAllEmailMessages();
        for (int i = 0; i < testValue; i++) {
            mailBox.addPaperMessageToBox(
                new PaperMessage("gdgfdgfd" + i, "fdfds" + (testValue - i),
                    "message", "senddata", "receivedate"));
        }
        mailBox.printAllPaperMessages();
    }

    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

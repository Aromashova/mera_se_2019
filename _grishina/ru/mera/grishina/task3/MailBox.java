package ru.mera.grishina.task3;

import java.lang.*;
import java.time.LocalDateTime;

public class MailBox {
    static private final int index = 10;
    private EmailMessage [] emailMessageBox = new EmailMessage [index] ;
    private PaperMessage [] paperMessageBox = new PaperMessage [index];
    private int nextEmailPosition = 0;
    private int nextPaperPosition = 0;

    public void addEmail (EmailMessage message){
        if (nextEmailPosition == emailMessageBox.length ){
            increaseEmailArray();
        }
        emailMessageBox [nextEmailPosition] = message;
        nextEmailPosition++;
    }

    private void increaseEmailArray() {
        EmailMessage [] extended = new EmailMessage [emailMessageBox.length + index] ;
        // Copies an array from the specified source array
        System.arraycopy(emailMessageBox, 0, extended, 0, emailMessageBox.length);
        emailMessageBox = extended;
    }

    public void addLetter (PaperMessage message){
        if (nextPaperPosition >= paperMessageBox.length ){
            increaseLetterArray();
        }
        paperMessageBox [nextPaperPosition] = message;
        nextPaperPosition++;
    }

    private void increaseLetterArray() {
        PaperMessage [] extended = new PaperMessage [paperMessageBox.length + index] ;
        // Copies an array from the specified source array
        System.arraycopy(paperMessageBox, 0, extended, 0, paperMessageBox.length);
        paperMessageBox = extended;
    }

    public void getAllEmails (){
        for (int i = 0; i < emailMessageBox.length; i++ ){
            System.out.println(emailMessageBox [i]);
        }
    }

    public void getAllLetters (){
       for (int i = 0; i < paperMessageBox.length; i++ ){
           System.out.println(paperMessageBox [i]);
       }
    }
}

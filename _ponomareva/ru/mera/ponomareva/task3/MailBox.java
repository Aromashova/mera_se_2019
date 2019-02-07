package ru.mera.ponomareva.task3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MailBox {

    /*В классе ru.mera.ponomareva.MailBox есть 4 метода: добавить сообщение обычное, электронное, получить все обычные сообщения, получить все электронные сообщения.

9.       Массивы должны «вырастать», если емкость существующего массива заканчивается. Можете использовать System.arrayCopy для этого*/

    EmailMessage[] emailMessages = new EmailMessage[2];
    PaperMessage[] paperMessages = new PaperMessage[2];

    public void addEmailMessage(Person from, Person to, String message, LocalDateTime sendDate, LocalDateTime receiveDate){
        EmailMessage emailMessage = new EmailMessage(from, to, message, sendDate, receiveDate);
        isEmailBoxFull();
        for(int i =0; i<emailMessages.length-1;i++){
            if(emailMessages[i]==null){
                emailMessages[i]=emailMessage;
                break;
            }
        }

    }

    public void addPaperMessage(Person from, Person to, String message, int fromPostalIndex, int toPostalIndex){
        PaperMessage paperMessage = new PaperMessage(from, to, message,fromPostalIndex, toPostalIndex);
        isPaperBoxFull();
        for(int i =0; i<paperMessages.length-1;i++){
            if(paperMessages[i]==null){
                paperMessages[i]=paperMessage;
                break;
            }
        }

    }

    public void receiveAllEmailMessages(){
        for(EmailMessage emailMessage:emailMessages){
            if(emailMessage==null)
                break;
            else{
                System.out.println("New email message received:\n"+
                        "From: "+emailMessage.getFrom().getName()+" "+emailMessage.getFrom().getSurname()+"\n"+
                        "To: "+emailMessage.getTo().getName()+" "+emailMessage.getTo().getSurname()+"\n"+
                        "Message: "+emailMessage.getMessage()+"\n"+
                        "Send date "+emailMessage.getSendDate()+"\n"+
                        "Receive date "+emailMessage.getReceiveDate()+"\n"+
                        "Array len = "+emailMessages.length+"\n");
            }
        }

    }

    public void receiveAllPaperMessages(){
        for (PaperMessage paperMessage:paperMessages){
            if(paperMessage==null)
                break;
            else{
                System.out.println("New paper message received:\n"+
                        "From: "+paperMessage.getFrom().getName()+" "+paperMessage.getFrom().getSurname()+"\n"+
                        "To: "+paperMessage.getTo().getName()+" "+paperMessage.getTo().getSurname()+"\n"+
                        "Message: "+paperMessage.getMessage()+"\n"+
                        "From postal index "+paperMessage.getFromPostalIndex()+"\n"+
                        "To postal index "+paperMessage.getToPostalIndex()+"\n"+
                        "Array len = "+paperMessages.length+"\n");
            }
        }

    }

    public void isEmailBoxFull(){
        boolean full = true;
        for(int i =0; i<emailMessages.length-1;i++){
            if(emailMessages[i]==null){
                full = false;
                break;
            }
        }
        if(full){
            emailMessages = Arrays.copyOf(emailMessages, emailMessages.length+2);
        }
    }

    public void isPaperBoxFull(){
        boolean full = true;
        for(int i =0; i<paperMessages.length-1;i++){
            if(paperMessages[i]==null){
                full = false;
                break;
            }
        }
        if(full){
            paperMessages = Arrays.copyOf(paperMessages, paperMessages.length+2);
        }

    }

}

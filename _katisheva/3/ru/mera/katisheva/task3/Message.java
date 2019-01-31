package ru.mera.katisheva.task3;//package task3;

public class Message {
    private Person From;
    private Person To;
    private String MessageText;


    Message(){
        From=null;
        To=null;
        MessageText="Empty";
    }
    Message(Person from, Person to, String msg){
        From=from;
        To=to;
        MessageText=msg;
    }
    Message(Message msg){
        From=msg.From;
        To=msg.To;
        MessageText=msg.MessageText;
    }

    Person getFrom() {
        return From;
    }

    Person getTo() {
        return To;
    }

    String getMessageText() {
        return MessageText;
    }

    public void printMessage(){
        System.out.println("\nFrom: "+From.getName()+" To: "+To.getSurname()+"\nEmail message: "+MessageText);
    }
}


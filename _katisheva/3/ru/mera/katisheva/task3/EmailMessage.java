package ru.mera.katisheva.task3;//package task3;

import java.time.LocalDateTime;

class EmailMessage extends Message {
    private LocalDateTime SendDateTime;
    private LocalDateTime ReceiveDateTime;
    public EmailMessage(Person from, Person to, String msg, LocalDateTime sendDateTime, LocalDateTime receiveDateTime){
        super(from,to, msg);
        SendDateTime=sendDateTime;
        ReceiveDateTime=receiveDateTime;
    }

    EmailMessage(Message msg, LocalDateTime sendDateTime, LocalDateTime receiveDateTime){
        super(msg);
        SendDateTime=sendDateTime;
        ReceiveDateTime=receiveDateTime;
    }

    EmailMessage(Person from, Person to, String msg, String sendDateTime, String receiveDateTime){
        super(from, to ,msg);
        SendDateTime=LocalDateTime.parse(sendDateTime);
        ReceiveDateTime=LocalDateTime.parse(receiveDateTime);
    }

    EmailMessage(){
        super();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        SendDateTime=LocalDateTime.now();
        ReceiveDateTime=LocalDateTime.of(2019,1,1,0,0,0);
    }

    EmailMessage(EmailMessage emailMessage){
        super(emailMessage.getFrom(), emailMessage.getTo(), emailMessage.getMessageText());
        SendDateTime=emailMessage.SendDateTime;
        ReceiveDateTime=emailMessage.ReceiveDateTime;
    }

    LocalDateTime getReceiveDateTime() {
        return ReceiveDateTime;
    }

    LocalDateTime getSendDateTime() {
        return SendDateTime;
    }

    void printSendDateTime(){
        System.out.println("\nSend date and time: "+SendDateTime.toString());
    }
    void printReceiveDateTime(){
        System.out.println("\nReceive date and time: "+ReceiveDateTime.toString());
    }

}

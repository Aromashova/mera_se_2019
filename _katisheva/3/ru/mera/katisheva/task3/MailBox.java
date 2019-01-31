package ru.mera.katisheva.task3;//package task3;

import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;


class MailBox {
    private EmailMessage[] EmailBox;
    private PaperMessage[] PaperBox;
    private int EmailPutIndex, EmailGetIndex;
    private int PaperPutIndex, PaperGetIndex;

    MailBox(int EmailBoxSize, int PaperBoxSize){
        EmailGetIndex=EmailPutIndex=0;
        EmailBox=new EmailMessage[EmailBoxSize];
        PaperGetIndex=PaperPutIndex=0;
        PaperBox=new PaperMessage[PaperBoxSize];
    }

    MailBox(EmailMessage[] EBox, PaperMessage[] PBox){
        EmailGetIndex=EmailPutIndex=0;
        EmailBox=new EmailMessage[EBox.length];
        PaperGetIndex=PaperPutIndex=0;
        PaperBox=new PaperMessage[PBox.length];
        for(int i=0; i<EBox.length; i++){
            putEmailMessage(EBox[i]);
        }
        for(int i=0; i<PBox.length; i++){
            putPaperMessage(PBox[i]);
        }
    }

    private void putEmailMessage(EmailMessage msg){
        if(EmailPutIndex==EmailBox.length-1)
        {
            //System.out.println("EmailBox is full.");
            //return;
            EmailMessage[] reducedEBox=new EmailMessage[EmailBox.length+1];
            /*for(int i=0; i<EmailBox.length; i++){
                reducedEBox[i]=EmailBox[i];
            }*/
            System.arraycopy(EmailBox,0,reducedEBox,0,EmailBox.length);
            EmailBox=reducedEBox;
        }
        EmailPutIndex++;
        EmailBox[EmailPutIndex]=msg;

    }

    private void putPaperMessage(PaperMessage msg){
        if(PaperPutIndex==PaperBox.length-1)
        {
            //System.out.println("PaperBox is full.");
            //return;
            PaperMessage[] reducedPBox=new PaperMessage[PaperBox.length+1];
            System.arraycopy(PaperBox,0,reducedPBox,0,PaperBox.length);
            PaperBox=reducedPBox;
        }
        PaperPutIndex++;
        PaperBox[PaperPutIndex]=msg;
    }

    private EmailMessage getEmailMessage(){
        if(EmailPutIndex==EmailGetIndex){
            System.out.println("EmailBox is empty.");
            return new EmailMessage();
        }
        EmailGetIndex++;
        return EmailBox[EmailGetIndex];

    }

    private PaperMessage getPaperMessage(){
        if(PaperPutIndex==PaperGetIndex){
            System.out.println("PaperBox is empty.");
            return new PaperMessage();
        }
        PaperGetIndex++;
        return PaperBox[PaperGetIndex];

    }

    int getEmailGetIndex() {
        return EmailGetIndex;
    }

    int getPaperGetIndex() {
        return PaperGetIndex;
    }

    int getEmailPutIndex() {
        return EmailPutIndex;
    }

    int getPaperPutIndex() {
        return PaperPutIndex;
    }

    public static void main(String[] args){
        LocalDateTime receivedDateTime1=LocalDateTime.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime sendDateTime1=LocalDateTime.of(2019,1,22,12,0,0);
        LocalDateTime sendDateTime2=LocalDateTime.of(2019,1,22,9,30,0);
        LocalDateTime receivedDateTime2=LocalDateTime.of(2019,1,22,10,0,0);
        Person person1=new Person("Misha","Ivanov");
        Person person2=new Person("Masha","Petrova");
        Person person3=new Person("Olga","Sidorova");
        Person person4=new Person("Roma","Nikolaev");
        Person person5=new Person("Tanya","Shkarina");
        Person person6=new Person("Natasha","Malysheva");
        Message msg1=new Message(person1,person2,"Happy New Year!");
        Message msg2=new Message(person3,person4,"Hello!");
        Message msg3=new Message(person5,person6,"Have a nice day!");
        Message msg4=new Message(person1,person4,"Good bye!");
        Message msg5=new Message(person2,person4,"Happy birthday!");
        EmailMessage EMsg1=new EmailMessage(msg1,sendDateTime1,receivedDateTime1);
        EmailMessage EMsg2=new EmailMessage(msg3,sendDateTime2,receivedDateTime2);
        EmailMessage EMsg3=new EmailMessage(msg5,sendDateTime1,receivedDateTime2);
        PaperMessage PMsg1=new PaperMessage(msg2,"123123","223111");
        PaperMessage PMsg2=new PaperMessage(msg4,"123155","220000");

        MailBox mailBox1=new MailBox(1,1);
        //System.out.println("EmailPutIndex: "+mailBox1.EmailPutIndex);
        //System.out.println("EmailGetIndex: "+mailBox1.EmailGetIndex);
        //System.out.println("EmailPutIndex: "+mailBox1.PaperPutIndex);
        //System.out.println("EmailGetIndex: "+mailBox1.PaperGetIndex);
        mailBox1.putEmailMessage(EMsg1);
        mailBox1.putEmailMessage(EMsg2);
        mailBox1.putEmailMessage(EMsg3);
        mailBox1.putPaperMessage(PMsg1);
        mailBox1.putPaperMessage(PMsg2);
        //System.out.println("mailBox1.EmailBox.length: "+mailBox1.EmailBox.length);
        //System.out.println("EmailPutIndex: "+mailBox1.EmailPutIndex);
        //System.out.println("EmailGetIndex: "+mailBox1.EmailGetIndex);
        //System.out.println("mailBox1.PaperBox.length: "+mailBox1.PaperBox.length);
        //System.out.println("PaperPutIndex: "+mailBox1.PaperPutIndex);
        //System.out.println("PaperGetIndex: "+mailBox1.PaperGetIndex);
        System.out.println("Email messages: ");
        for(int i=0; i< mailBox1.EmailPutIndex; i++){
            EmailMessage getEmailMsg=mailBox1.getEmailMessage();
            System.out.println("\nemail message: "+(i+1));
            //System.out.println("EmailPutIndex: "+mailBox1.EmailPutIndex);
            //System.out.println("EmailGetIndex: "+mailBox1.EmailGetIndex);
            System.out.println("From: "+getEmailMsg.getFrom().getName()+" "+getEmailMsg.getFrom().getSurname());
            System.out.println("To: "+getEmailMsg.getTo().getName()+" "+getEmailMsg.getTo().getSurname());
            System.out.println("Text: "+getEmailMsg.getMessageText());
            System.out.println("Send date and time: "+getEmailMsg.getSendDateTime());
            System.out.println("Receive date and time: "+getEmailMsg.getReceiveDateTime());
        }
        System.out.println("\nPaper messages: ");
        for(int i=0; i< mailBox1.PaperPutIndex; i++){
            PaperMessage getPaperMsg=mailBox1.getPaperMessage();
            System.out.println("\npaper message: "+(i+1));
            //System.out.println("PaperPutIndex: "+mailBox1.PaperPutIndex);
            //System.out.println("PaperGetIndex: "+mailBox1.PaperGetIndex);
            System.out.println("From: "+getPaperMsg.getFrom().getName()+" "+getPaperMsg.getFrom().getSurname());
            System.out.println("To: "+getPaperMsg.getTo().getName()+" "+getPaperMsg.getTo().getSurname());
            System.out.println("Text: "+getPaperMsg.getMessageText());
            System.out.println("Send postal index: "+getPaperMsg.getFromPostalIndex());
            System.out.println("Receive postal index: "+getPaperMsg.getToPostalIndex());

        }

    }
}

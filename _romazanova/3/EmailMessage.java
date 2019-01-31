package ru.mera.romazanova.task3;

public class EmailMessage extends Message {

    private final String senddate;
    private final String receivedate;
    public EmailMessage(String from, String to, String message, String  senddate, 
        String receivedate  ) {
        super(from, to, message);
        this.senddate = senddate;
        this.receivedate = receivedate;  
    }
    public String getSendDate() {
        return senddate;
    }
    public String getReceiveDate() {
        return receivedate;
    }
    public String toString (){
        return super.toString() + " " + senddate + " " + receivedate;
    }

}

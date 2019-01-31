package ru.mera.katisheva.task3;//package task3;


class PaperMessage extends Message {
    private String ToPostalIndex;
    private String FromPostalIndex;
    public PaperMessage(Person from, Person to, String msg, String toPostalIndex, String fromPostalIndex){
        super(from,to, msg);
        ToPostalIndex=toPostalIndex;
        FromPostalIndex=fromPostalIndex;
    }

    PaperMessage(Message message, String toPostalIndex, String fromPostalIndex){
        super(message);
        ToPostalIndex=toPostalIndex;
        FromPostalIndex=fromPostalIndex;
    }

    PaperMessage(){
        super();
        ToPostalIndex="000000";
        FromPostalIndex="000000";
    }

    PaperMessage(PaperMessage paperMessage){
        super(paperMessage.getFrom(), paperMessage.getTo(), paperMessage.getMessageText());
        ToPostalIndex=paperMessage.ToPostalIndex;
        FromPostalIndex=paperMessage.FromPostalIndex;
    }

    String getFromPostalIndex() {
        return FromPostalIndex;
    }

    String getToPostalIndex() {
        return ToPostalIndex;
    }
}

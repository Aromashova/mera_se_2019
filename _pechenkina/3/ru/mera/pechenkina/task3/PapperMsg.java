package ru.mera.pechenkina.task3;

public class PapperMsg extends Message {

    private Integer toIndex;
    private Integer fromIndex;
	
	public PapperMsg(Person sender, Person reciever, String message, Integer toindex, Integer fromindex) {
		super(sender, reciever, message);
		this.toIndex = toindex;
		this.fromIndex = fromindex;
	}

	public Integer getToIndex() {
		return toIndex;
	}

	public Integer getFromIndex() {
		return fromIndex;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Message: To:%s From:%s Text:%s toindex:%s fromindex: %s",getSender(), getReciever(), getMessage(), getToIndex(), getFromIndex());
	}
	
	

}

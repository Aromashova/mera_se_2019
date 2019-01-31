package ru.mera.pechenkina.task3;

import java.time.LocalDateTime;

public class EmailMsg extends Message {

	LocalDateTime sendDate;
	LocalDateTime recieveDate;
	
	public EmailMsg(Person sender, Person reciever, String message, LocalDateTime sendDate, LocalDateTime recieveDate) {
		super(sender, reciever, message);
		this.sendDate = sendDate;
		this.recieveDate = recieveDate;
	}

	public LocalDateTime getSendDate() {
		return sendDate;
	}

	public LocalDateTime getRecieveDate() {
		return recieveDate;
	}

	@Override
	public String toString() {
		return String.format("Message: To:%s From:%s Text:%s sendDate:%s recdate: %s",getSender(), getReciever(), getMessage(), getSendDate(), getRecieveDate());
	}	
}

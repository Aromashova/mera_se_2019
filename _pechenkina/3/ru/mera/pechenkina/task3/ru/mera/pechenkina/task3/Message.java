package ru.mera.pechenkina.task3;

public class Message {

	private Person sender;
	private Person reciever;
	private String message;

	/**
	 * @param sender
	 * @param reciever
	 * @param message
	 */

	public Message(Person sender, Person reciever, String message) {
		this.sender = sender;
		this.reciever = reciever;
		this.message = message;
	}

	public Person getSender() {
		return sender;
	}

	public Person getReciever() {
		return reciever;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return String.format("Message: To:%s From:%s Text:%s",sender, reciever, message);
	}	
}

package ru.mera.romazanova.task3;

 public class Person {
 public static void main ( String [] args ){
	 MailBox mailBox = new MailBox();
	 for (int i = 0; i < 10; i++) {
	     mailBox.addEmailMessageToBox(new EmailMessage("Moskva" + i, "NN"+ (10 - i), "message", "senddata", "receivedate"));
	 }
	 mailBox.printAllEmailMessages();
	 for (int i = 0; i < 10; i++) {
	     mailBox.addPaperMessageToBox (new PaperMessage("gdgfdgfd" + i, "fdfds"+ (10 - i), "message", "senddata", "receivedate"));
	 }
	 mailBox.printAllPaperMessages();
 }
	
	private	final String name;
	private final String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
}



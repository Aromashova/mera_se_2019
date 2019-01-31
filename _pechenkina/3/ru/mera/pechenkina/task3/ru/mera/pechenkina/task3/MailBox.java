package ru.mera.pechenkina.task3;

import java.time.LocalDateTime;

public class MailBox {

	public static void main(String[] args) {
		MailBox mb = new MailBox();
		
		Person ps1 = new Person("Sergey", "Egoryche");
		Person ps2 = new Person("Alex", "Ixem");
		Person ps3 = new Person("Peny", "Refd");
		Person ps4 = new Person("FDs", "c");
		Person ps5 = new Person("WErr", "5fgf");
		Person ps6 = new Person("54", "43");
	
		EmailMsg msg = new EmailMsg(ps1, ps2, "when we'll go?", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
		mb.addNewEmailMsg(msg);
		EmailMsg msg1 = new EmailMsg(ps3, ps4, " where we'll go?", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
		mb.addNewEmailMsg(msg1);
		EmailMsg msg2 = new EmailMsg(ps5, ps6, "why we'll go?", LocalDateTime.now(), LocalDateTime.now().plusDays(1));
		mb.addNewEmailMsg(msg2);
		
		
		PapperMsg pmsg1 = new PapperMsg(ps6, ps2, "Privet is Duchambe", 603137, 609875);
		mb.addNewPprMsg(pmsg1);
		PapperMsg pmsg2 = new PapperMsg(ps1, ps5, "From Paris with love", 123908, 603456);
		mb.addNewPprMsg(pmsg2);
		PapperMsg pmsg3 = new PapperMsg(ps3, ps4, "I'll come soon", 875699, 609875);
		mb.addNewPprMsg(pmsg3);
		
		
		//Print List of email Messages
		mb.printAllEmailMsgs();
		//Count length of list with Emails
		int m= mb.email.length;
		System.out.println("Lenght array emails = " + m);
		
		//Print List of email Messages
		mb.printAllPprMsgs();
		//Count length of list with Pappers
		int y= mb.papper.length;
		System.out.println("Length array papper = " + y);
		
	}

	EmailMsg[] email = new EmailMsg[1];
	PapperMsg[] papper = new PapperMsg[1];
	int k=0;
	int j=0;
	
	public EmailMsg[] addNewEmailMsg(EmailMsg msg) {
		if (k < email.length) {
			email[k++] = msg;
		} else {
			EmailMsg[] tempArray = new EmailMsg[email.length*2+1];
			System.arraycopy(email, 0, tempArray, 0, email.length);
			email = tempArray;
			email[k++] = msg;
		}
		
		return email;
	}

	public PapperMsg[] addNewPprMsg(PapperMsg pmsg) {
		if (j < papper.length) {
			papper[j++] = pmsg;
		} else {
			PapperMsg[] tempArray = new PapperMsg[papper.length*2+1];
			System.arraycopy(papper, 0, tempArray, 0, papper.length);
			papper = tempArray;
			papper[j++] = pmsg;
		}
		
		return papper;
	}

	public PapperMsg[] getPapper() {
		return papper;
	}

	public EmailMsg[] getEmail() {
		return email;
	}

	public void printAllEmailMsgs(){
		for (int i = 0; i < email.length; i++ ){
			System.out.println(email [i]);
		}
	}
	
	public void printAllPprMsgs(){
		for (int i = 0; i < papper.length; i++ ){
			System.out.println(papper [i]);
		}
	}
}

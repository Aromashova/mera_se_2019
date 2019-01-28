package ru.mera.pechenkina.task4;

public class Musician extends Person{

	private String instrument;
	
	public Musician(String name, String surname, String instrument) {
		super(name, surname);
		this.instrument = instrument;
		// TODO Auto-generated constructor stub
	}

	public Musician(Person smon, String instrument) {
		super(smon.getName(),smon.getSurname());
		this.instrument = instrument ;
		// TODO Auto-generated constructor stub
	}
	public String getInstrument() {
		return instrument;
	}

	@Override
	public String getPersonProf() {
		// TODO Auto-generated method stub
		return "musician";
	}

}

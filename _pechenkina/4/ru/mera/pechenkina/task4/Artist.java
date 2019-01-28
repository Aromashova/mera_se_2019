package ru.mera.pechenkina.task4;

public class Artist extends Person{
	
	private String style;

	public Artist(String name, String surname, String style) {
		super(name, surname);
		this.style = style;
		// TODO Auto-generated constructor stub
	}

	public Artist(Person smon, String style) {
		super(smon.getName(),smon.getSurname());
		this.style = style;
		// TODO Auto-generated constructor stub
	}

	public String getStyle() {
		return style;
	}

	@Override
	public String getPersonProf() {
		// TODO Auto-generated method stub
		return "Artist";
	}
	
}

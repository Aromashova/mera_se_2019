package ru.mera.pechenkina.task4;

public class Person {
	private String name;
	private String surname;
	
	

	/**
	 * @param name
	 * @param surname
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}


    public String toString() {
    	return String.format("name:%s surname:%s",name, surname);
    	
    }
  
	public String getPersonProf() {
		return "unknown";
		
	}
}

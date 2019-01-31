package ru.mera.pechenkina.task4;

import java.util.Random;

public class AllPersons {

	public Person[] persons = new Person[1];
	private Integer k=0;
	
	public Person[] addNewPersonToList(Person smbd) {
		if ( k < persons.length) {
			persons[k++] = smbd;
		} else {
			Person[] newsmbdArray = new Person[persons.length*2 +1];
			System.arraycopy(persons, 0, newsmbdArray, 0, persons.length);
			persons=newsmbdArray;
			persons[k++] = smbd;
		}	
		return persons;	
	}
	
	public void getAllPeople(Person[] persons) {
		for (Person person : persons) {
			System.out.println("People:" + person);
		}		
	}
	
	public Person[] getPersons() {
		return persons;
	}

	public static void main(String[] args) {

		AllPersons allpers = new AllPersons();

		Person ps1=  new Person("fdg", "1");
		Person ps2=  new Person("hgy", "2");
		Person ps3=  new Person("fdf", "3");
		Person ps4=  new Person("aaa", "4");
		Person ps5=  new Person("sss", "5");
		Person ps6=  new Person("ddd", "6");
		Person ps7=  new Person("fff", "7");
		Person ps8=  new Person("vvv", "8");
		Person ps9=  new Person("ccc", "9");
		
		/*allpers.addNewPersonToList(ps1);
		allpers.addNewPersonToList(ps2);
		allpers.addNewPersonToList(ps3);
		allpers.addNewPersonToList(ps4);
		allpers.addNewPersonToList(ps5);
		allpers.addNewPersonToList(ps6);
		allpers.addNewPersonToList(ps7);
		allpers.addNewPersonToList(ps8);
		allpers.addNewPersonToList(ps9);
		*/
		
		//All People names
		//allpers.getAllPeople(allpers.persons);
 
		//Arrays of People
		Person[] pss = new Person[] {ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9};
		
		String[] styles = new String[] {"impression", "abstract", "realism", "surealism", "kubism","grafic", "symbolic", "animationa","hydozhnic"};
		String[] instruments = new String[] {"balalaika", "gitar", "skripka", "violin", "domra", "truba", "klarnet","bas", "piano", "svirel"};

		
		//Add persons their professions
		Person pers = new Person();
	    Random r = new Random(System.currentTimeMillis());

	    for (int i=0; i<9; i++) {
	    	Person person = pss[i];
	    	String style = styles[i];
	    	String instrum = instruments[i];
	    	if (r.nextBoolean()) {
		        pers = new Artist(person, style);
		    } else {
		        pers = new Musician(person, instrum);
		    }
		    
		    allpers.addNewPersonToList(pers);
		    
		    System.out.println(pers.getPersonProf());
		    if (pers instanceof Artist) {
		        System.out.format("People are: name:%s subname:%s style:%s\n", pers.getName(), pers.getSurname(), ((Artist) pers).getStyle());
		    } else if (pers instanceof Musician) {
			        System.out.format("People are: name:%s subname:%s style:%s\n", pers.getName(), pers.getSurname(), ((Musician) pers).getInstrument());

		    } else {
		    	System.out.println("output there is nobody");
		    }		    
	    }
	   
	    //Print all people with format of Persons
	    //allpers.getAllPeople(allpers.getPersons());
	    
	    

	}

}

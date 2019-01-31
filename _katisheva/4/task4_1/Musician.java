package task4_1;

class Musician extends Person {
    private String Instrument;
    Musician(){
        super();
        Instrument="";
    }
    Musician(String name, String surname, String instrument){
        super(name, surname);
        Instrument=instrument;
    }
    Musician(Person person, String instrument){
        super(person);
        Instrument=instrument;
    }

    String getInstrument() {
        return Instrument;
    }
}

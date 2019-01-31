package task4_1;

class Person {
    private String Name;
    private String Surname;

    Person() {
        Name = "";
        Surname = "";
    }

    Person(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    Person(Person person){
        Name=person.Name;
        Surname=person.Surname;
    }

    String getName() {
        return Name;
    }

    String getSurname() {
        return Surname;
    }

    @Override
    public String toString() {
        return Name + " " + Surname;

    }
}
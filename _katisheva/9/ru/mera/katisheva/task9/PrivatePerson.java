package ru.mera.katisheva.task9;

public class PrivatePerson {
    @JsonName(jsonName = "name")
    private String name;
    @JsonName(jsonName = "surname")
    private String surname;
    @JsonName(jsonName = "birthday")
    private String birthday;

    @ConstAnnot(constAnnot = PrivatePerson.class)
    PrivatePerson(String name, String surname, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    PrivatePerson(){
        this.name = "unknown";
        this.surname = "unknown";
        this.birthday = "unknown";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "PrivatePerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

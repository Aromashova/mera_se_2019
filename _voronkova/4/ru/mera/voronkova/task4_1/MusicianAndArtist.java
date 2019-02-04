package ru.mera.voronkova.task4_1;

import java.util.Random;

/**
 * Задание 1. Приводимая неприводимость.
 *
 * 1. Создать класс Person с именем и фамилией. Переопределите метод toString, чтобы выводились имя и фамилия.
 * 2. Создать класс Artist (наследник Person) с дополнительным полем style - тип "рисования"
 * 3. Создать класс Musician с дополнительным полем Instrument - инстурмент на котором играет музыкант.
 * Метод toString в классах Artist и musician не переопределяйте!
 * 4. Создать массив типа Person.
 * 5. Положить туда несколько Музыкантов и Художников. (можно используя Random - класть случайных людей, выбирая имена, фамилии, стили и инструменты
 * из заранее определенного списка)
 * 6. Испольщую цикл for выведите на экран список всех людей в формате:
 * "<имя> <фамилия> играет на <instrument>"
 * или
 * "<имя> <фамилия> рисует в стиле  <style>"
 * а зависимости от типа объекта (используйте instanceof, чтобы проверить)
 */

public class MusicianAndArtist {
    public static void main(String[] args) {
        String [] surnames = {"Show", "Bond", "Simpson", "Honda", "Takeshi", "Tanaka", "Voron"};
        String [] names = {"Katya", "Marina", "Alexsander", "Andrey", "Make", "Idzumi"};
        String [] styles = {"Abstract Expressionism", "Cubism", "Surrealism", "Renaissance", "Modern", "Baroque", "Classicism", "Futurism"};
        String [] instruments = {"Piano", "Classical Guitar", "Drum set", "Electric Guitar", "Violin", "Percussion", "Saxophone"};
        Person [] persons = new Person[10];
        for (int i=0; i<persons.length;i++){
            persons[i] = createPerson(names,surnames,styles,instruments);
        }
        getPersons(persons);
    }

    private static Random random = new Random(System.currentTimeMillis());

    private static Person createPerson (String [] names, String [] surnames, String [] styles, String [] instruments){
        String name = String.valueOf(names[random.nextInt(names.length)]);
        String surname = String.valueOf(surnames[random.nextInt(surnames.length)]);
        String style = String.valueOf(styles[random.nextInt(styles.length)]);
        String instrument = String.valueOf(instruments[random.nextInt(instruments.length)]);
        if (random.nextBoolean()){
            return new Artist(name, surname, style);
        }
        else{
            return  new Musician(name, surname,instrument);
        }
    }
    private static void getPersons(Person[] persons) {
        for (Person person : persons) {
            if (person instanceof Artist) {
                System.out.println(person + " draws " + ((Artist) person).getStyle() + " style");
            } else if (person instanceof Musician) {
                System.out.println(person + " plays the " + ((Musician) person).getInstrument());
            }
        }
    }
}

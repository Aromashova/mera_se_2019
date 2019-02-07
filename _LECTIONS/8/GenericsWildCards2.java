import java.util.ArrayList;
import java.util.List;

public class GenericsWildCards2 {

    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

       /* Cat bars = new Cat("Барсик");
        zoo.add(bars); вынесли в отдельный метод fillCats
        cats.add(bars);*/
        fillCatsIncorrect(zoo);
        fillCatsIncorrect(cats);
      //  fillCats(dogs); можно было бы передать и собак!
        Dog shar = new Dog("Шарик");
        zoo.add(shar);
        dogs.add(shar);
        Animal animal = zoo.get(0);


        printAnimals(dogs);
        printAnimals(cats);

        fillCatsIncorrect(cats);

        ArrayList<Dog> dogs2 = new ArrayList<>();
        fillCatsIncorrect(dogs2);
        for (Dog dog : dogs2) {

        }

        fillCats(cats);
        fillCats(zoo);
        //fillCats(dogs); не работает,

    }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.name);

        }
    }

    public static void fillCatsIncorrect(List<? extends Animal> cats) {
        Cat bars = new Cat("Барсик");
        //cats.add(bars); не работает
    }

    public static void fillCats(List<? super Cat> cats) {
        Cat bars = new Cat("Барсик");
        cats.add(bars);

        /*for (Animal cat : cats) { не работает
            System.out.println(cat.name);

        }*/

    }
    public static void printCats(List<? extends Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat.name);

        }
    }


}

import java.util.ArrayList;
import java.util.List;



public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.animals.add(new Cat("Мурку"));
        z.animals.add(new Wolf("Акелла"));
        z.animals.add(new Sheep("Долли"));

        String meat = " говядина";
        String grass = " ромашковое сено";

        List<Wild> wildAnimals = new ArrayList<>();
        List<GrassEater> grasseaters = new ArrayList<>();

        for (Animal animal : z.animals) {
            if (animal instanceof Wild) {
                wildAnimals.add((Wild) animal);
            }
            if (animal instanceof GrassEater) {
                grasseaters.add((GrassEater) animal);
            }
        }

        System.out.println("Дикие животные");

        for (Wild wildAnimal : wildAnimals) {
            System.out.println(wildAnimal.getName());
        }
        System.out.println("Травоядные животные");

        for (GrassEater grassEater : grasseaters) {
            System.out.println(grassEater.getName());
        }

        for (Animal animal : z.animals) {
           // System.out.println("Кормим " + animal.name);

            if (animal instanceof Wild) {
              //  ((Wild) animal).eatMeat(meat);
            } else if (animal instanceof GrassEater) {
           //     ((GrassEater) animal).eatGrass(grass);
            }
        }

    }
}

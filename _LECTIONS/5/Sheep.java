public class Sheep extends Animal implements GrassEater {
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void eatGrass(String grassType) {
        System.out.println(" Съела траву с названием " + grassType);

    }
}

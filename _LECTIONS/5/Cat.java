public class Cat extends Animal implements GrassEater, Wild {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eatGrass(String grassType) {
        System.out.println("Мяу! Ем траву " + grassType);
    }

    @Override
    public void eatMeat(String meatType) {
        System.out.println("МЯЯЯУ!!! Съем " + meatType);
    }
}

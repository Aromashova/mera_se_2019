public class Zoo {

    public static void main(String[] args) {
        try {
            feedAnimal("Зебра", "Трава");
            feedAnimal("Волк", "Трава");
        } catch (ImNotGrassEaterException e) {
            System.out.println(e.who + " не хочет есть траву");
            throw new RuntimeException("Животные не накормлены", e);
        }
    }


    public static void feedAnimal(String who, String what) throws ImNotGrassEaterException, NullPointerException {
        if (who.equals("Волк") && what.equals("Трава")) {
            throw new ImNotGrassEaterException(who);
        }

        System.out.println(who + " ест " + what);

    }
}

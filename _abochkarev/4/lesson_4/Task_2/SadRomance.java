package lesson_4.Task_2;

public class SadRomance extends CocktailMaker {
    @Override
    String getLiquid() {
        return "sugar syrup, apple juice, lime juice, sprite";
    }

    @Override
    String getMainIngredient() {
        return "kiwi, tarragon";
    }

    @Override
    String addTopping() {
        return "ice cubes";
    }
}

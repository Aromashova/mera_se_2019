package lesson_4.Task_2;

public class JustLemonade extends CocktailMaker {

    @Override
    String getLiquid() {
        return "sugar syrup, soda";
    }

    @Override
    String getMainIngredient() {
        return "lemon, ice cubes";
    }

    @Override
    String addTopping() {
        return "mint";
    }
}

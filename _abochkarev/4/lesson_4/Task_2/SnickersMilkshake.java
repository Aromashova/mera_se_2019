package lesson_4.Task_2;

public class SnickersMilkshake extends CocktailMaker{

    @Override
    String getLiquid() {
        return "milk, caramel syrup, chocolate syrup";
    }

    @Override
    String getMainIngredient() {
        return "vanilla ice cream";
    }

    @Override
    String addTopping() {
        return "roasted peanuts";
    }
}

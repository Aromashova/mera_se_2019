package ru.mera.grishina.task4_1;

public class ChocolateCocktailMaker extends CocktailMaker {
    public ChocolateCocktailMaker() {

    }

    @Override
    public String takeSomethingLiquid() {
        return "Milk";
    }

    @Override
    public String takeMainIngredient() {
        return "Chocolate";
    }

    @Override
    public String addTopping() {
        return "Caramel";
    }
}

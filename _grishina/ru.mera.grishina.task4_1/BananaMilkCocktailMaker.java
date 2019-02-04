package ru.mera.grishina.task4_1;

public class BananaMilkCocktailMaker extends CocktailMaker {
    public BananaMilkCocktailMaker() {

    }

    @Override
    public String takeSomethingLiquid() {
        return "Milk";
    }

    @Override
    public String takeMainIngredient() {
        return "Banana";
    }

    @Override
    public String addTopping() {
        return "Ice cream";
    }
}

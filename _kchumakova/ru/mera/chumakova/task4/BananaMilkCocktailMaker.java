package ru.mera.chumakova.task4;

public class BananaMilkCocktailMaker extends CocktailMaker {
    @Override
    public String getLiquid() {
        return "Milk";
    }

    @Override
    public String getMainIngredient() {
        return "Banana";
    }

    @Override
    public String getToping() {
        return "Ice cream";
    }
}

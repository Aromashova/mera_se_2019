package ru.mera.chumakova.task4;

public class MokhitoCocktailMaker extends CocktailMaker{
    @Override
    public String getLiquid() {
        return "lemonade";
    }

    @Override
    public String getMainIngredient() {
        return "lime";
    }

    @Override
    public String getToping() {
        return "mint";
    }
}

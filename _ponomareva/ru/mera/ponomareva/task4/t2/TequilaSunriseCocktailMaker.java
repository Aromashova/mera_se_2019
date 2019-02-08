package ru.mera.ponomareva.task4.t2;

public class TequilaSunriseCocktailMaker extends CocktailMaker{

    @Override
    public String getLiquidElement() {
        return "Orange juice";
    }

    @Override
    public String getMainElement() {
        return "Tequila";
    }

    @Override
    public String getTopping() {
        return "Cocktail cherry";
    }
}

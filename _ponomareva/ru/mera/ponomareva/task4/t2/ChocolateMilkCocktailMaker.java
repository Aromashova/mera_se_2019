package ru.mera.ponomareva.task4.t2;

public class ChocolateMilkCocktailMaker extends CocktailMaker {

    @Override
    public String getLiquidElement() {
        return "Milk";
    }

    @Override
    public String getMainElement() {
        return "Chocolate";
    }

    @Override
    public String getTopping() {
        return "Whipped cream";
    }
}

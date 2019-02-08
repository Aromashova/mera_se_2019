package ru.mera.ponomareva.task4.t2;

public class MojitoCocktailMaker extends CocktailMaker {

    @Override
    public String getLiquidElement() {
        return "Soda water";
    }

    @Override
    public String getMainElement() {
        return "Rum";
    }

    @Override
    public String getTopping() {
        return "Mint";
    }
}

package ru.mera.voronkova.task4_2;

public class Mojito extends CocktailMaker {
    @Override
    public String liquid() {
        return "sprite";
    }

    @Override
    public String mainIngredient() {
        return "key lime";
    }

    @Override
    public String toping() {
        return "mint";
    }
}

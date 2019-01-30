package ru.mera.voronkova.task4_2;

public class MulledWine extends CocktailMaker{
    @Override
    public String liquid() {
        return "red wine";
    }

    @Override
    public String mainIngredient() {
        return "orange, apple";
    }

    @Override
    public String toping() {
        return "сardamom, сlove, cinnamon, sugar";
    }
}

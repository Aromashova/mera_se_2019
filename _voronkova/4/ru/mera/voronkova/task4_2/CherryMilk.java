package ru.mera.voronkova.task4_2;

public class CherryMilk extends CocktailMaker{
    @Override
    public String liquid() {
        return "Milk";
    }

    @Override
    public String mainIngredient() {
        return "Cherry";
    }

    @Override
    public String toping() {
        return "chocolate sprinkles";
    }
}

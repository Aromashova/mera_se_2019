package ru.mera.chumakova.task4;

public abstract class CocktailMaker {

    public void mix() {
        String liquid = getLiquid();
        String mainIngredient = getMainIngredient();
        String toping = getToping();
        System.out.println(String.format("Mix %s and %s and add toping %s", liquid, mainIngredient, toping));
    }

    public abstract String getLiquid();

    public abstract String getMainIngredient();

    public abstract String getToping();
}

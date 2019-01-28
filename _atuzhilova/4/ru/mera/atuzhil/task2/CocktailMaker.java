package ru.mera.atuzhil.task2;

public abstract class CocktailMaker {
    public void mix() {
        System.out.format("Mix %s with %s and add %s%n", getLiquid(), getMainIngredient(), getTopping());
    }
    public abstract String getLiquid();
    public abstract String getMainIngredient();
    public abstract String getTopping();
}
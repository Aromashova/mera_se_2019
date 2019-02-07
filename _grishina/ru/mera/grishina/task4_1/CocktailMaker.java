package ru.mera.grishina.task4_1;

public abstract class CocktailMaker {
    public abstract String takeSomethingLiquid();
    public abstract String takeMainIngredient();
    public abstract String addTopping();
    public void Mix() {
        System.out.println("Mix " + takeSomethingLiquid() + " with " + takeMainIngredient() + " & add " + addTopping());
    }
}
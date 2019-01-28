package ru.mera.atuzhil.task2;

public abstract class CocktailMaker {
    private String liquid;
    private String mainIngredient;
    private String topping;

    public CocktailMaker(String liquid, String mainIngredient, String topping) {
        this.liquid = liquid;
        this.mainIngredient = mainIngredient;
        this.topping = topping;
    }

    public void mix() {
        System.out.format("Mix %s with %s and add %s%n", this.liquid, this.mainIngredient, this.topping);
    }

    public String getLiquid() {
        return this.liquid;
    }

    public String getMainIngredient() {
        return this.mainIngredient;
    }

    public String getTopping() {
        return this.topping;
    }
}
package ru.mera.grishina.task4_1;

public class ChocolateCocktailMaker extends CocktailMaker {
    public String liquid;
    public String mainIngredient;
    public String topping;

    public ChocolateCocktailMaker(String liquid, String mainIngredient, String topping) {
        super();
        this.liquid = liquid;
        this.mainIngredient = mainIngredient;
        this.topping = topping;
    }

    public ChocolateCocktailMaker() {}

    @Override
    public String takeSomethingLiquid() {
        return "Milk";
    }

    @Override
    public String takeMainIngredient() {
        return "Chocolate";
    }

    @Override
    public String addTopping() {
        return "Caramel";
    }
}
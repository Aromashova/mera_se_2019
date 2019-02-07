package ru.mera.grishina.task4_1;

public class BananaMilkCocktailMaker extends CocktailMaker {
    public String liquid;
    public String mainIngredient;
    public String topping;

    public BananaMilkCocktailMaker(String liquid, String mainIngredient, String topping) {
        super();
        this.liquid = liquid;
        this.mainIngredient = mainIngredient;
        this.topping = topping;
    }

    public BananaMilkCocktailMaker() {}

    @Override
    public String takeSomethingLiquid() {
        return "Milk";
    }

    @Override
    public String takeMainIngredient() {
        return "Banana";
    }

    @Override
    public String addTopping() {
        return "Ice cream";
    }
}

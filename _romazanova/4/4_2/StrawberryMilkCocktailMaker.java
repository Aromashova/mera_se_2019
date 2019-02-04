package ru.mera.romazanova.task4_2;

public class StrawberryMilkCocktailMaker extends CocktailMaker {

    private static final String LIQUID = "milk";
    private static final String MAININGREDIENT = "strawberry";
    private static final String TOPING = "chocolate";
    
    @Override
    public String takeSamethingLiquid() {
        return LIQUID;
    }

    @Override
    public String takeMainIngredient() {
        return MAININGREDIENT;
    }

    @Override
    public String takeToping() {
        return TOPING;
    }
}
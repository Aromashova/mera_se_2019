package ru.mera.romazanova.task4_2;

public class BananaMilkCocktailMaker extends CocktailMaker {

    private static final String LIQUID = "milk";
    private static final String MAININGREDIENT = "banana";
    private static final String TOPING = "icecream";

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
package ru.mera.romazanova.task4_2;

public abstract class CocktailMaker {


    public void mix() {
        String liquid = takeSamethingLiquid ();
        String mainIngredient = takeMainIngredient ();
        String toping = takeToping ();
        System.out.println("Mix " + liquid + " with " + mainIngredient + " and add on top of "
            + toping);
    }
    public abstract String takeSamethingLiquid ();
    public abstract String takeMainIngredient ();
    public abstract String takeToping ();
}
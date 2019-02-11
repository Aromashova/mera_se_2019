package ru.mera.ponomareva.task4.t2;

public abstract class CocktailMaker {

    public abstract String getLiquidElement();

    public abstract String getMainElement();

    public abstract String getTopping();

    public void mix(){
        String liquidElement = getLiquidElement();
        String mainElement = getMainElement();
        String topping = getTopping();
        System.out.println(liquidElement + " and " + mainElement + " cocktail with " + topping);

    }
}

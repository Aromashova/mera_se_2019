package ru.mera.atuzhil.task2;

public class Main {
    public static void main(String[] args) {
        CocktailMaker[] makers = new CocktailMaker[]{new BananaMilkCocktailMaker(), new ChocolateMilkCocktailMaker(), new StrawberryMilkCocktailMaker()};
        for (CocktailMaker maker: makers) {
            maker.mix();
        }
    }
}
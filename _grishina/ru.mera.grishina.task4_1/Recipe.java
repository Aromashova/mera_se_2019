package ru.mera.grishina.task4_1;

public class Recipe {
    public static void main(String[] args) {
        CocktailMaker[] cocktailMachine = new CocktailMaker[2];
        cocktailMachine[0] = new BananaMilkCocktailMaker();
        cocktailMachine[1] = new ChocolateCocktailMaker();

        for (int i = 0; i < cocktailMachine.length; i++) {
            cocktailMachine[i].Mix();
        }
    }
}

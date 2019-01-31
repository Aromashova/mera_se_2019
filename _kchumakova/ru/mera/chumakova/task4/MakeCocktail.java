package ru.mera.chumakova.task4;

public class MakeCocktail {
    public static void main(String[] args) {
        CocktailMaker[] cocktailMachines= new CocktailMaker[2];
        cocktailMachines[0] = new BananaMilkCocktailMaker();
        cocktailMachines[1] = new MokhitoCocktailMaker();

        for (int i = 0; i < cocktailMachines.length; i++) {
            cocktailMachines[i].mix();
        }
    }
}

package ru.mera.ponomareva.task4.t2;

import java.util.ArrayList;
import java.util.List;

public class Mix {
    public static void main (String[] args){
        CocktailMaker[] cocktailMachines = new CocktailMaker[3];

        cocktailMachines[0] = new ChocolateMilkCocktailMaker();
        cocktailMachines[1] = new TequilaSunriseCocktailMaker();
        cocktailMachines[2] = new MojitoCocktailMaker();

        for (int i = 0; i < cocktailMachines.length; i++) {
            cocktailMachines[i].mix();
        }
    }
}

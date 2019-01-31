package ru.mera.romazanova.task4_2;

public class Test4_2 {

    public static void main(String[] args) {

        CocktailMaker [] containerOfCocktailMakers = new  CocktailMaker [2]; 
        containerOfCocktailMakers [0] = new BananaMilkCocktailMaker();
        containerOfCocktailMakers [1] = new StrawberryMilkCocktailMaker();

        for ( int i = 0; i < containerOfCocktailMakers.length; i++){
            containerOfCocktailMakers [i].mix();
        }
    }
}

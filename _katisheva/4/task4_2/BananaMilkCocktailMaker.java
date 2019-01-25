package task4_2;

class BananaMilkCocktailMaker extends CocktailMaker {


    BananaMilkCocktailMaker(){
        liquid="milk";
        mainIngredient="bananas";
        toping="icecream";
    }
    String getLiquid(){
        return liquid;
    }

    String getMainIngredient(){
        return mainIngredient;
    }

    String getToping(){
        return toping;
    }
}

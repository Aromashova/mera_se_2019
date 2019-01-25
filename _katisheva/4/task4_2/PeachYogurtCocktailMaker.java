package task4_2;

class PeachYogurtCocktailMaker extends CocktailMaker{
    PeachYogurtCocktailMaker(){
        liquid="yogurt";
        mainIngredient="peach";
        toping="nuts";
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

package task4_2;

class StrawberryMilkCocktailMaker extends CocktailMaker{
    StrawberryMilkCocktailMaker(){
        liquid="milk";
        mainIngredient="strawberries";
        toping="chocolate";
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

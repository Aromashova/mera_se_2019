package task4_2;

class VegetableSaladMaker extends CocktailMaker{
    VegetableSaladMaker(){
        liquid="sauce";
        mainIngredient="vegetables";
        toping="greenery";
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

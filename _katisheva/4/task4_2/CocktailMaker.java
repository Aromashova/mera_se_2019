package task4_2;

abstract class CocktailMaker {
    protected String liquid;
    protected String mainIngredient;
    protected String toping;

    /*CocktailMaker(String liquide_value, String mainIngredient_value, String toping_value){
        liquid=liquide_value;
        mainIngredient=mainIngredient_value;
        toping=toping_value;
    }*/

    abstract String getLiquid();

    abstract String getMainIngredient();

    abstract String getToping();

    void mix(){
        liquid=getLiquid();
        mainIngredient=getMainIngredient();
        toping=getToping();
        System.out.println("Mix "+ liquid+" with "+mainIngredient+" and add "+toping+" on topic");
    }
}

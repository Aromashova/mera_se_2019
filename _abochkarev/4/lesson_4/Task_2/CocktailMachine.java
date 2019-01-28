package lesson_4.Task_2;

public class CocktailMachine {
    public static void main(String[] args) {
        CocktailMaker[] recipes = new CocktailMaker[3];

        recipes[0] = new SnickersMilkshake();
        recipes[1] = new JustLemonade();
        recipes[2] = new SadRomance();

        for (CocktailMaker recipe : recipes) {
            recipe.mix();
        }
    }
}

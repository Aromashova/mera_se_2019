package lesson_4.Task_2;

public abstract class CocktailMaker {
    abstract String getLiquid();

    abstract String getMainIngredient();

    abstract String addTopping();

    void mix() {
        System.out.println("Mix " + getLiquid() + " with " + getMainIngredient() + " and add " + addTopping() + ".");
    }
}

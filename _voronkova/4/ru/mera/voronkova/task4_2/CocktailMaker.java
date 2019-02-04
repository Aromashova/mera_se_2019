package ru.mera.voronkova.task4_2;

public abstract class CocktailMaker {
        public abstract String liquid();
        public  abstract  String mainIngredient();
        public abstract  String toping();
        public void mix(){
            System.out.println("Mix "+liquid()+" and "+mainIngredient()+", add "+toping());
        }

}

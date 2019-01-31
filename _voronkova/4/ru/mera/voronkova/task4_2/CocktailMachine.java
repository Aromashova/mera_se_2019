package ru.mera.voronkova.task4_2;

/**
 * Задание 2. Абстрактная конкретность.
 * Сегодня будем делать машину для приготовления коктейлей.
 *
 * Рецепт - очень простой:
 * public void mix() {
 *         взятьЧтоТоЖидкое();
 *         взятьОсновнойИнгредиент();
 *         добавитьТопинг()
 *         print("Смешиваю %жидкое% с %наполнитель% и добавляю сверху %топинг%")
 * };
 *
 *
 * Вам нужно:
 * 1. Сделать базовый абстрактный класс CocktailMaker с методом mix() и тремя абстрактными методами для получения жидкого ингредиента, основного и топинга.
 * 2.Создать несколько конкретных классов, которые всегда будут возвращать одни и те же ингредиенты.
 * Например, BananaMilkCocktailMaker:
 * public String liquid {return "Молоко"}
 * public String mainIngredient {return "Банан"}
 * public String toping{return "Мороженое"}
 * 3. Создать массив для базового класса и положить туда несколько разных машин для приготовления коктейлей.
 * 4. Запустить все машины по одному разу использую цикл for.
 */

public class CocktailMachine {
    public static void main(String[] args) {
        CocktailMaker[] recipes = new CocktailMaker[3];
        recipes[0] = new CherryMilk();
        recipes[1] = new Mojito();
        recipes[2] = new MulledWine();
        for (CocktailMaker recipe:recipes){
            recipe.mix();
        }
    }
}

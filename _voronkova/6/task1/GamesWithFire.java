package task1;


import java.util.ArrayList;
import java.util.Random;

/**
 * Задание 1. Игры с огнем.
 * У нас есть 4 времени года и 4 игры.
 * Для каждого времени года есть своя игра:
 * Зима – снежки
 * Весна – запуск корабликов по ручьям
 * Лето – Ловля солнечных зайчиков
 * Осень – Измерение глубины луж методом сапога.
 *
 * Есть команда из 4х человек.
 * У каждого человека есть имя.
 * Каждый человек умеет играть только в одну игру.
 *
 * Ваша задача:
 * 1. Взять случайный сезон.
 * 2. Взять случайного человека.
 * 3. Если человек умеет играть в игру для этого сезона – вывести на консоль «Выиграл!» иначе – «Проиграл»
 *
 * Рекомендации:
 * 1. Создайте enum с играми
 * 2. Создайте enum с временами года. В каждый элемент добавьте соответствующую сезону игру.
 * 3. возьмите массив со всеми значениями используя Enum.values() и возьмите случайный элемент используя Random()
 */

public class GamesWithFire {
    public static void main(String[] args) {
        String [] players = new String[]{"Карина","Таня", "Саша", "Вова"};
        startGame();
        playGame(players);
    }
    private static void startGame(){
        System.out.println("Начинаем игры с огнем.\nОписание: ");
        Season [] seasons = Season.values();
        for(Season season:seasons){
            System.out.println(season.toString());
        }
    }
    private static ArrayList<Persons> formTeam(String[] players){
        System.out.println("Есть команда из 4х человек. Каждый человек умеет играть только в одну игру.");
        Game [] games = Game.values();
        ArrayList<Persons> team = new ArrayList<Persons>();
        if (players.length==4){
            for (int i=0;i<players.length;i++){
                team.add(new Persons(players[i], games[i]));
                System.out.println(team.get(i).toString());
            }
        }
        else{
            System.out.println("Для игры нужно 4 участника.");
        }
        return team;
    }
    private static void playGame(String [] players){
        ArrayList<Persons> team = formTeam(players);
        Season [] seasons = Season.values();

        Random random = new Random(System.currentTimeMillis());
        Persons randomPerson =  team.get(random.nextInt(4));
        Season randomSeason = seasons[random.nextInt(4)];

        System.out.println("Игра началась!");
        if(randomPerson.getGame()==randomSeason.seasonGame){
            System.out.println("Результат: игрок " + randomPerson.getName()+ " выиграл в игру \"" + randomSeason.seasonGame.getGameDescription() + "\".");
        }
        else {
            System.out.println("Результат: игрок " + randomPerson.getName()+ " проиграл в игру \"" + randomSeason.seasonGame.getGameDescription() + "\".");
        }
    }
}

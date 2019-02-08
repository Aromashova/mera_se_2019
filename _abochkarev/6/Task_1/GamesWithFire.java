package Task_1;

import java.util.Random;

public class GamesWithFire {
    public static void main(String[] args) {
        System.out.println("Let the games begin ;)");

        Random random = new Random();
        Seasons[] seasons = Seasons.values();
        Team[] gamers = Team.values();

        Team gamer = gamers[random.nextInt(4)];
        Seasons season = seasons[random.nextInt(4)];

        if (gamer.specialisation == season.game) {
            System.out.println("Won! :)  player " + gamer + " can play in " + season.game.gameDescription);
        } else {
            System.out.println("Lose :(  player " + gamer + " can't play in " + season.game.gameDescription);
        }
    }
}

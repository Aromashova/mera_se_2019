package ru.mera.grishina.task6_1;

import java.util.Random;
import java.util.ArrayList;

public class FireGame {
    enum Seasons {
        WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");
        final String greeting;

        Seasons(String greeting) {
            this.greeting = greeting;
        }
    }
    /*public static final class SeasonsClass {
        final static SeasonsClass WINTER = new SeasonsClass();
        final static SeasonsClass SPRING = new SeasonsClass();
        final static SeasonsClass SUMMER = new SeasonsClass();
        final static SeasonsClass AUTUMN = new SeasonsClass();
    }*/

    enum Games {
        SNOWBALL("Snowballs", Seasons.WINTER), SHIPLAUNCHING("Launching ships along the creeks", Seasons.SPRING),
        SUNBEAMS("Catching sunbeams", Seasons.SUMMER), POOLMEASUR("Pool depth measurement using the boot method", Seasons.AUTUMN);
        final String game;
        final Seasons greeting;

        Games(String game, Seasons greeting) {
            this.game = game;
            this.greeting = greeting;
        }
    }
    /*public static final class GamesClass {
        final static GamesClass SNOWBALL = new GamesClass();
        final static GamesClass SHIPLAUNCHING = new GamesClass();
        final static GamesClass SUNBEAMS = new GamesClass();
        final static GamesClass POOLMEASUR = new GamesClass();
    }*/

    public static void main(String[] args) {

        Games[] game = Games.values();

        ArrayList <DreamTeam> team = new ArrayList <DreamTeam> ();

        DreamTeam gamer1 = new DreamTeam("Freddie Mercury", Games.SNOWBALL);
        DreamTeam gamer2 = new DreamTeam("Roger Taylor", Games.SHIPLAUNCHING);
        DreamTeam gamer3 = new DreamTeam("John Deacon", Games.SUNBEAMS);
        DreamTeam gamer4 = new DreamTeam("Brian May", Games.POOLMEASUR);
        team.add(gamer1);
        team.add(gamer2);
        team.add(gamer3);
        team.add(gamer4);

        /*    if (man instanceof Artist) {
                System.out.format("%s %s %s draws in style %s.\n", man.getArea(), man.getName(), man.getSurname(), ((Artist) man).getStyle());
            }
            if (man instanceof Musician) {
                System.out.format("%s %s %s plays on %s.\n", man.getArea(), man.getName(), man.getSurname(), ((Musician) man).getInstrument());
            }
        */

        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < 4; i++) {
            int rand_game = rand.nextInt(4);
            int rand_gamer = rand.nextInt(4);
            if (team.get(rand_gamer).getGame() == game[rand_game]) {
                System.out.format("%s best of all playing %s.\n", team.get(rand_gamer).getName(), game[rand_game]);
            } else {
                System.out.format("%s lose in %s.\n", team.get(rand_gamer).getName(), game[rand_game]);
            }
        }
    }
}
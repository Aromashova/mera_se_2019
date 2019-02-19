package ru.mera.chumakova.Task6.subtask1;

import java.util.Random;

public class PlayGames {

    public static void main(String[] args) {
        Games[] games = Games.values();
        Seasons[] seasons = Seasons.values();
        Player[] players = new Player[4];
        Random rand = new Random();
        for(int i=0; i<players.length; i++) {
            players[i] = new Player(games[rand.nextInt(4)]);
        }
        for(int i=0; i<players.length; i++) {
            Games seasonGame = seasons[rand.nextInt(4)].getGame();
            if(players[i].getGame().equals(seasonGame)){
                System.out.println(String.format("Players game: %s, Season game: %s, выиграл!", players[i].getGame(), seasonGame) );
            } else {
                System.out.println(String.format("Players game: %s, Season game: %s, проиграл", players[i].getGame(), seasonGame) );
            }
        }
    }
}

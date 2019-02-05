package ru.mera.romazanova.task6_1;

import java.util.Random;

import ru.mera.romazanova.task6_1.Player.Players;

public class FourPlayers {

    private final Player[] fourPlayers = new Player[4];

    FourPlayers() {
        fourPlayers[0] = new Player(Players.VASYA);
        fourPlayers[1] = new Player(Players.PETYA);
        fourPlayers[2] = new Player(Players.SASHA);
        fourPlayers[3] = new Player(Players.MASHA);
    }

    public Player getRandomPlayer() {
        final Player randomSeason = fourPlayers[new Random().nextInt(fourPlayers.length)];
        return randomSeason;
    }

}

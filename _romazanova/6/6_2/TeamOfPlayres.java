package ru.mera.romazanova.task6_2;

import java.util.HashSet;
import java.util.Random;

import ru.mera.romazanova.task6_2.Player.PlayerStatus;

public class TeamOfPlayres {
    private final HashSet<Player> newteam = new HashSet<Player>();

    TeamOfPlayres() {
        newteam.add(new Player("Vasya", getRandomStatus()));
        newteam.add(new Player("Petya", getRandomStatus()));
        newteam.add(new Player("Masha", getRandomStatus()));
        newteam.add(new Player("Olya", getRandomStatus()));
        newteam.add(new Player("Pavel", getRandomStatus()));
        newteam.add(new Player("Oleg", getRandomStatus()));
        newteam.add(new Player("Natasha", getRandomStatus()));
        newteam.add(new Player("Katya", getRandomStatus()));
        newteam.add(new Player("Lena", getRandomStatus()));
        newteam.add(new Player("Polina", getRandomStatus()));

    }

    public void getListOfPlayersNamesAndStatus() {
        System.out.println("The team consists of the following players:");
        for (final Player players : newteam) {
            System.out.print(players.getName() + " ");
            System.out.print(players.getStatus() + " ");
        }
    }

    public HashSet<Player> getTeam() {
        return newteam;
    }

    private final PlayerStatus getRandomStatus() {
        PlayerStatus randomStatus = null;
        if ((new Random().nextInt(3)) == 0) {
            randomStatus = PlayerStatus.HIDED;
        } else if ((new Random().nextInt(3)) == 1) {
            randomStatus = PlayerStatus.DIDNOTHIDE;
        } else {
            randomStatus = PlayerStatus.WENTHOME;
        }
        return randomStatus;

    }
}

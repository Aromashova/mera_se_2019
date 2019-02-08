package ru.mera.grishina.task6_1;

import ru.mera.grishina.task6_1.FireGame.Games;

public class DreamTeam {
    private String name;
    private Games game;

    public DreamTeam(String name, Games game) {
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public Games getGame() {
        return game;
    }
}

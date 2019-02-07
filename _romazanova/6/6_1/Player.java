package ru.mera.romazanova.task6_1;

import ru.mera.romazanova.task6_1.Season.Games;

public class Player {
    private Games game;
    private final Players name;

    public Player(Players name) {
        this.game = null;
        this.name = name;
        switch (name) {
        case VASYA:
            this.game = Games.SNOWBALLS;
        case PETYA:
            this.game = Games.LAUNCHINGBOATS;
            break;
        case SASHA:
            this.game = Games.CHATCHINGSUNBEAMS;
            break;
        case MASHA:
            this.game = Games.MEASURINGOFPUDDLE;
            break;
        }
    }

    public Players getName() {
        return name;
    }

    public Games getGame() {
        return game;
    }

    enum Players {
        VASYA("Vasya"), PETYA("Petya"), SASHA("Sasha"), MASHA("Masha");
        private final String value;

        Players(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}

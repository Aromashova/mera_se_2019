package ru.mera.chumakova.Task6.subtask1;

public enum Seasons {

    WINTER(Games.SNOWBALLS),
    SPRING(Games.SHIP),
    SUMMER(Games.SUNBEAMS),
    AUTUMN(Games.MEASURE_PUDDLES);

    private final Games game;
    Seasons(Games game) {
        this.game=game;
    }

    public Games getGame() {
        return game;
    }
}

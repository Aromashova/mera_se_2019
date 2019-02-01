package ru.mera.katisheva.task6_1;

public enum Season {
    WINTER(Games.SNOWBALLS), SPRING(Games.SHIPS), SUMMER(Games.SUNLIGHTS), FALL(Games.PUDDLES);

    private Games game;
    Season(Games g){
        game=g;
    }

    public Games getGame() {
        return game;
    }
}



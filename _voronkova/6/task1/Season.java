package task1;

public enum Season {
    WINTER(Game.SNOWBALLS, "Зима"),
    SPRING(Game.PAPER_SHIPS,"Весна"),
    SUMMER(Game.SUNLIGHT_CATHING,"Лето"),
    AUTUMN(Game.PLAY_IN_PUDDLE,"Осень");

    Game seasonGame;
    String seasonName;

    Season(Game seasonGame, String seasonName) {
        this.seasonGame = seasonGame;
        this.seasonName = seasonName;
    }


    @Override
    public String toString() {
        return  seasonName + " - пора для игры \"" + seasonGame.getGameDescription() + "\".";
    }
}

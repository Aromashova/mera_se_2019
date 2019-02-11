package Task_1;

public enum Seasons {
    WINTER(Games.SNOWBALLS),
    SPRING(Games.LAUNCHING_SHIPS_ALONG_THE_CREEKS),
    SUMMERy(Games.CATCHING_THE_REFLECTED_SUNBEAM),
    AUTUMN(Games.PUDDLE_DEPTH_MEASUREMENT_WITH_A_BOOT);

    Games game;

    Seasons(Games game) {
        this.game = game;
    }

    public Games getGame() {
        return game;
    }

    public String toString() {
        return this.name();
    }
}

package Task_1;

public enum Team {
    Max(Games.SNOWBALLS),
    Tom(Games.LAUNCHING_SHIPS_ALONG_THE_CREEKS),
    Mary(Games.CATCHING_THE_REFLECTED_SUNBEAM),
    Dan(Games.PUDDLE_DEPTH_MEASUREMENT_WITH_A_BOOT);

    Games specialisation;

    Team(Games specialisation) {
        this.specialisation = specialisation;
    }

    public Games getSpecialisation() {
        return specialisation;
    }

    public String toString() {
        return this.name();
    }
}

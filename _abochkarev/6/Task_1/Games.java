package Task_1;

public enum Games {
    SNOWBALLS("Snowballs"),
    LAUNCHING_SHIPS_ALONG_THE_CREEKS("Launching ships along the creeks"),
    CATCHING_THE_REFLECTED_SUNBEAM("Catching the reflected sunbeam"),
    PUDDLE_DEPTH_MEASUREMENT_WITH_A_BOOT("Puddle depth measurement with a boot");

    String gameDescription;

    Games(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameDescription() {
        return gameDescription;
    }
}

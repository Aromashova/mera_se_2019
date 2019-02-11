package task1;

public enum Game {
    SNOWBALLS("Снежки"),
    PAPER_SHIPS("Запуск корабликов по ручьям"),
    SUNLIGHT_CATHING("Ловля солнечных зайчиков"),
    PLAY_IN_PUDDLE("Измерение глубины луж методом сапога");

    String gameDescription;

    Game(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getGameDescription() {
        return gameDescription;
    }
}

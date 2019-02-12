package task2;

public enum PlayerCondition {
    HIDE("спрятался"),
    NOT_HIDE("не спрятался"),
    WENT_HOME("ушел домой");

    String conditionDescription;

    PlayerCondition(String conditionDescription) {
        this.conditionDescription = conditionDescription;
    }

    public String getConditionDescription() {
        return conditionDescription;
    }
}

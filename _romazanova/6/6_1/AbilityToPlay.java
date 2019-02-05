package ru.mera.romazanova.task6_1;

public class AbilityToPlay {
    FourSeason fourseason = new FourSeason();
    FourPlayers fourPlayers = new FourPlayers();

    public void abilityToPlay() {
        final Season tempSeason = fourseason.getRandomSeason();
        final Player tempPlayer = fourPlayers.getRandomPlayer();
        if (tempSeason.getGame() == tempPlayer.getGame()) {
            System.out.printf("The player %s wins!", tempPlayer.getName().getValue());
        } else {
            System.out.printf("The player %s has lost! He (She) can plays ony %s.", tempPlayer.getName().getValue(),
                    tempPlayer.getGame().getValue());
        }
    }
}

package ru.mera.romazanova.task6_2;

public class Test6_2 {

    public static void main(String[] args) {
        // final TeamOfPlayres testTeam = new TeamOfPlayres();
        // testTeam.getListOfPlayersNamesAndStatus();
        final Game newGame = new Game();
        newGame.getListOfPlayersNames();

        newGame.firstSearchOfPlayers("Lena");
        newGame.firstSearchOfPlayers("Vasya");
        newGame.firstSearchOfPlayers("Oleg");
        newGame.getLossingPlayersForFirstSearch();
        newGame.getWinnerPlayersForFirstSearch();
        System.out.println("\nThe second method of searching");
        try {
            newGame.secondSearchOfPlayers("Oleg");
            // newGame.secondSearchOfPlayers("Lena");
        } catch (final MiJeDogovorarivalisDomaNePryatatsaException ex) {
            System.out.println(ex.getMessage());
        } finally {
            newGame.getLossingPlayersForSecondSearch();
            newGame.getWinnerPlayersForSecondSearch();
        }
    }
}

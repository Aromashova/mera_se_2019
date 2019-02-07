package ru.mera.romazanova.task6_2;

import java.util.HashSet;
import java.util.Set;

import ru.mera.romazanova.task6_2.Player.PlayerStatus;

public class Game {
    TeamOfPlayres newTeam = new TeamOfPlayres();
    HashSet<Player> losingPlayersForFirstSearch = new HashSet<Player>();
    HashSet<Player> winningPlayersForFirstSearch = new HashSet<Player>();
    HashSet<Player> losingPlayersForSecondSearch = new HashSet<Player>();
    HashSet<Player> winningPlayersForSecondSearch = new HashSet<Player>();

    public void getListOfPlayersNames() {
        newTeam.getListOfPlayersNamesAndStatus();
    }

    public void firstSearchOfPlayers(String nameOfPlayrs) {
        System.out.printf("\n %s, does not hide!", nameOfPlayrs);
        for (final Player players : newTeam.getTeam()) {
            if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.DIDNOTHIDE) {
                losingPlayersForFirstSearch.add(players);
            } else if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.HIDED) {
                winningPlayersForFirstSearch.add(players);
            } else if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.WENTHOME) {
                continue;
            }
        }

    }

    public void secondSearchOfPlayers(String nameOfPlayrs) throws MiJeDogovorarivalisDomaNePryatatsaException {
        for (final Player players : newTeam.getTeam()) {
            if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.DIDNOTHIDE) {
                winningPlayersForSecondSearch.add(players);
            } else if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.HIDED) {
                losingPlayersForSecondSearch.add(players);
            } else if (players != null && nameOfPlayrs == players.getName()
                    && players.getStatus() == PlayerStatus.WENTHOME) {
                losingPlayersForSecondSearch.clear();
                winningPlayersForSecondSearch.clear();
                throw new MiJeDogovorarivalisDomaNePryatatsaException("\nExeption: The player " + players.getName()
                        + " plays dishonestly and went at home! Game over without winners and losers ");
            }
        }
    }

    public void getLossingPlayersForFirstSearch() {
        getPlayers("\nLosing players: ", losingPlayersForFirstSearch);
    }

    public void getWinnerPlayersForFirstSearch() {
        getPlayers("\nWinner players: ", winningPlayersForFirstSearch);
    }

    public void getLossingPlayersForSecondSearch() {
        getPlayers("\nLosing players: ", losingPlayersForSecondSearch);
    }

    public void getWinnerPlayersForSecondSearch() {
        getPlayers("\nWinner players: ", winningPlayersForSecondSearch);
    }

    private void getPlayers(String message, Set<Player> playersForFirstSearch) {
        System.out.println(message);
        for (final Player players : playersForFirstSearch) {
            if (players != null) {
                System.out.println(players.getName() + " ");
            }
        }
    }

}

class MiJeDogovorarivalisDomaNePryatatsaException extends Exception {
    public MiJeDogovorarivalisDomaNePryatatsaException(String message) {
        super(message);

    }
}

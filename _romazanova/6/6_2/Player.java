package ru.mera.romazanova.task6_2;

public class Player {
    private final String name;
    private final PlayerStatus status;

    Player(String name, PlayerStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public PlayerStatus getStatus() {
        return status;
    }

    PlayerStatus[] ContainerOfStatus = new PlayerStatus[3];

    enum PlayerStatus {
        HIDED("hided"), DIDNOTHIDE("did not hide"), WENTHOME("went home");

        private final String value;

        PlayerStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

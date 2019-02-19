package ru.mera.chumakova.Task6.subtask2;

import java.util.Random;

public class Player {
    private String name;
    private States state;

    public Player(String name) {
        this.name = name;

        States[] states = States.values();
        Random rand = new Random();
        this.state = states[rand.nextInt(3)];
    }

    public String getName() {
        return name;
    }

    public States getState() {
        return state;
    }
}

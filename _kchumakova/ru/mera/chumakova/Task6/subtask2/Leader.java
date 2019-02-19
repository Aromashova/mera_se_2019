package ru.mera.chumakova.Task6.subtask2;

import java.util.Random;

public class Leader {

    public Commands getCommand() {
        Commands[] commands = Commands.values();
        Random rand = new Random();
        return commands[rand.nextInt(2)];
    }
}

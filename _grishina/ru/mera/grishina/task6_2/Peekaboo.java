package ru.mera.grishina.task6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import ru.mera.grishina.task6_2.Members.Names;
import ru.mera.grishina.task6_2.Members.States;

/**
 * Peekaboo - a game played with a young child,
 * which involves hiding behind something and suddenly reappearing, saying “peekaboo” :)
 */

public class Peekaboo {
    public static Map<Integer, Members> participants = new HashMap<Integer, Members>();
    public static ArrayList<Members> winners = new ArrayList<Members>();
    public static ArrayList<Members> losers = new ArrayList<Members>();

    public static class MiJeDogovarivalisDomaNePryatatsaException extends Exception {
        public MiJeDogovarivalisDomaNePryatatsaException(String error) {
            super(error);
        }
    }

    public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {
        States[] state = States.values();
        Names[] name = Names.values();

        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i++) {
            participants.put(i, new Members(name[i].toString(), state[rand.nextInt(3)].toString()));
        }

        try {
            for (int i = 0; i < participants.size(); i++) {
                boolean mastersturn = rand.nextBoolean();
                if (mastersturn) {
                    if (participants.get(i).getState() == States.DIDNOTHIDE.toString()) {
                        losers.add(participants.get(i));
                    } else {
                        continue;
                    }
                } else {
                    if (participants.get(i).getState() == States.HIDE.toString()) {
                        winners.add(participants.get(i));
                    } else if (participants.get(i).getState() == States.DIDNOTHIDE.toString()) {
                        losers.add(participants.get(i));
                    } else {
                        throw new MiJeDogovarivalisDomaNePryatatsaException(participants.get(i).getName() + " playing dishonestly :(");
                    }
                }
            }

        } catch (MiJeDogovarivalisDomaNePryatatsaException error) {
            System.out.println(error);
        }

        // List of winners
        for (int i = 0; i < winners.size(); i++) {
            System.out.println("List of winners: " + winners.get(i));
        }

        // List of losers
        for (int i = 0; i < losers.size(); i++) {
            System.out.println("List of losers: " + losers.get(i));
        }
    }
}
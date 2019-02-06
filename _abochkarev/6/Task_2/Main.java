package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {

        List<Gamer> gamers = new ArrayList<>();
        Names[] names = Names.values();
        Random random = new Random();
        Master master = new Master(random);
        boolean winOrNot;
        List<Gamer> winners = new ArrayList<>();
        List<Gamer> losers = new ArrayList<>();

        for (Names name : names) {
            gamers.add(new Gamer(name, setGamersCondition(random)));
        }

        System.out.println(" === The game has begun: ===\n");
        for (Gamer gamer : gamers) {
            try {
                winOrNot = master.checkTheGamer(gamer);
                (winOrNot ? winners : losers).add(gamer);
                System.out.println(gamer.getName() + " condition:" + gamer.getCondition() + "\n");
            }catch (MiJeDogovarivalisDomaNePryatatsaException e){
                System.out.println(e.who + " Cheater!");
                throw e;
            }
        }

        System.out.println("\nWinners: ");
        System.out.println(winners);
        System.out.println("\nLosers: ");
        System.out.println(losers);
    }

    private static Condition setGamersCondition(Random random) {
        int selector = random.nextInt(101);

        if (selector < 45) {
            return Condition.HIDING;
        } else if (selector < 90) {
            return Condition.NOT_HIDING;
        }

        return Condition.GONE_HOME;
    }
}

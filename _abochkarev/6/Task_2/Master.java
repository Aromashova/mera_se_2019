package Task_2;

import java.util.Random;

public class Master {

    private Random random;

    Master(Random random) {
        this.random = random;
    }

    Boolean checkTheGamer(Gamer gamer) throws MiJeDogovarivalisDomaNePryatatsaException {
        boolean selector = random.nextBoolean();

        if (selector) {
            //Говорит: "Прячешься"
            if (gamer.getCondition() == Condition.GONE_HOME) {
                throw new MiJeDogovarivalisDomaNePryatatsaException(gamer.getName());
            }
            System.out.println("The Master says that a player  " + gamer.getName() + " hiding");
            return gamer.getCondition() == Condition.NOT_HIDING;
        } else {
            //Говорит: "Не прячешься"
            System.out.println("The Master says that a player " + gamer.getName() + " not hiding");
            return gamer.getCondition() == Condition.HIDING;
        }

    }
}

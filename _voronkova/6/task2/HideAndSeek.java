package task2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Задание 2. Прячешься!
 * Есть 10 игроков и один ведущий. Каждый игрок может быть в трех состояниях:
 * Спрятался, Не спрятался, Ушел домой. У каждого игрока есть имя. Имена игроков не повторяются.
 *
 * Ведущий пытается найти всех игроков. Он по очереди проверяет всех игроков.
 * Ведущий может:
 *
 * - сказать «Не прячешься!» и указать на определенного игрока.
 * Если игрок  не спрятался, то ведущий угадал его состояние и "застучал" – игрок попадает в команду проигравших.
 * Если игрок спрятался – игрок попадает в команду победивших.
 * - Сказать "Прячешься!" и указать на определенного игрока.
 * Если игрок не прятался – то ведущий его не заметил и игрок застукивается за себя и попадает в команду победивших.
 * Если игрок прятался, то он обязан выйти из укрытия, ведущий его находит и игрок попадает в команду проигравших.
 *
 * Если же игрок ушел домой, когда ему сказали "Прячешься!" – то это исключительная ситуация MiJeDogovarivalisDomaNePryatatsaException
 * и игра завершается без победителей и проигравших.
 * Ваша задача:
 * 1. Вывести список проигравших и список победивших.
 * 2. В случае исключительной ситуации вывести надпись «<имя игрока> играет нечестно»
 */
public class HideAndSeek {
    public static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws MiJeDogovarivalisDomaNePryatatsaException {
        playHideAndSeek(formPlayers());

    }

    private static ArrayList<Player> formPlayers(){
        PlayerCondition [] playerConditions = PlayerCondition.values();
        Player.Member [] members = Player.Member.values();
        ArrayList<Player> players = new ArrayList<Player>();
        for (Player.Member member : members) {
            players.add(new Player(member, playerConditions[random.nextInt(3)]));
        }
        return players;
    }

    private static void playHideAndSeek(ArrayList<Player> players) throws MiJeDogovarivalisDomaNePryatatsaException{
        ArrayList<Player> winners = new ArrayList<Player>();
        ArrayList<Player> losers = new ArrayList<Player>();
        Master.MasterAction[] masterActions = Master.MasterAction.values();
        for(Player player:players){
            Master.MasterAction randomMaster = masterActions[random.nextInt(2)];
            System.out.println("Ведущий говорит: " + randomMaster.getActionDescription() + " " + player.toString());
            try{
                if(randomMaster==Master.MasterAction.SAY_HIDE&&player.getCondition()==PlayerCondition.WENT_HOME){
                    throw new MiJeDogovarivalisDomaNePryatatsaException(player);
                }
                else if(randomMaster==Master.MasterAction.SAY_NOT_HIDE&&player.getCondition()==PlayerCondition.WENT_HOME){
                    System.out.println(player.getName().getMemberName()+", мы в своей игре забыли про тебя. Иди домой!");
                }
                else if ((randomMaster==Master.MasterAction.SAY_NOT_HIDE&&player.getCondition()==PlayerCondition.NOT_HIDE) ||
                        (randomMaster==Master.MasterAction.SAY_HIDE&&player.getCondition()==PlayerCondition.HIDE)){
                    losers.add(player);
                }
                else if ((randomMaster==Master.MasterAction.SAY_NOT_HIDE&&player.getCondition()==PlayerCondition.HIDE) ||
                        (randomMaster==Master.MasterAction.SAY_HIDE&&player.getCondition()==PlayerCondition.NOT_HIDE)){
                    winners.add(player);
                }
            }catch (MiJeDogovarivalisDomaNePryatatsaException e){
                System.out.println("\n" + player.getName().getMemberName() + " играет нечестно.\n");
                throw e;
            }
        }
        System.out.println("\nПобедители:");
        for (Player winner:winners){
            System.out.println(winner.getName().getMemberName());
        }
        System.out.println("\nПроигравшие:");
        for (Player loser:losers){
            System.out.println(loser.getName().getMemberName());
        }
    }
}

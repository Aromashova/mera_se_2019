package ru.mera.chumakova.Task6.subtask2;

public class Play {
    Player[] players = new Player[10];
    Player[] winners = new Player[10];
    Player[] losers = new Player[10];
    public static void main(String[] args) {
        Play play = new Play();
        play.definePlayers();
        try {
            play.play();
        } catch (MiJeDogovarivalisDomaNePryatatsaException e) {
            System.out.println(e.getMessage());
            return;
        }
        play.printGroups();
   }

   public void printGroups() {
       for (int i = 0; i < winners.length; i++) {
           while (winners[i]!= null){
               System.out.println(winners[i].getName());
           }
       }
       for (int i = 0; i < losers.length; i++) {
           while (losers[i]!= null){
               System.out.println(losers[i].getName());
           }
       }
   }

   public void definePlayers(){
       for (int i = 0; i < players.length; i++) {
           players[i] = new Player("Player"+(i+1));
       }
   }

   public void addPlayersToGroups(Player[] group, Player player) {
       for (int i = 0; i < group.length ; i++) {
           if(group[i] == null) {
               group[i] = player;
               break;
           }
       }
   }

   public void play() throws MiJeDogovarivalisDomaNePryatatsaException{
        Leader leader = new Leader();
       for (int i = 0; i < players.length; i++) {
           Commands leadersCommand = leader.getCommand();
           switch (players[i].getState()){
               case HID:
                   if(Commands.HIDING.equals(leadersCommand)){
                       System.out.println(String.format("Leader's command was: Hiding!, %s state was: %s. Lose", players[i].getName(), players[i].getState()));
                       addPlayersToGroups(losers, players[i]);
                   } else {
                       System.out.println(String.format("Leader's command was: Not hiding!, %s state was: %s. Win", players[i].getName(), players[i].getState()));
                       addPlayersToGroups(winners, players[i]);
                   }
                   break;
               case NOT_HIDE:
                   if(Commands.NOT_HIDING.equals(leadersCommand)){
                       System.out.println(String.format("Leader's command was: Not hiding!, %s state was: %s. Lose", players[i].getName(), players[i].getState()));
                       addPlayersToGroups(losers, players[i]);
                   } else {
                       System.out.println(String.format("Leader's command was: Hiding!, %s state was: %s. Win", players[i].getName(), players[i].getState()));
                       addPlayersToGroups(winners, players[i]);
                   }
                   break;
               case GONE_HOME:
                   throw new MiJeDogovarivalisDomaNePryatatsaException(String.format("Player %s plays dishonestly!", players[i].getName()));
           }
       }
   }
}

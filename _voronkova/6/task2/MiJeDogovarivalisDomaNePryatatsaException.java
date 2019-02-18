package task2;

public class MiJeDogovarivalisDomaNePryatatsaException extends Exception{
    Player dishonestPlayer;

    public MiJeDogovarivalisDomaNePryatatsaException(Player dishonestPlayer) {
        this.dishonestPlayer = dishonestPlayer;
    }
}

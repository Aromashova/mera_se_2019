package Task_2;

public class MiJeDogovarivalisDomaNePryatatsaException extends Exception {
    public Names who;

    public MiJeDogovarivalisDomaNePryatatsaException(Names who) {
        this.who = who;
    }
}

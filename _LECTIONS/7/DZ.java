import java.util.Random;

public class DZ {
    enum PlayerState {HIDDEN, VISIBLE, AT_HOME}


    public static void main(String[] args) {
        PlayerState[] players = { PlayerState.HIDDEN, PlayerState.HIDDEN, PlayerState.AT_HOME };

        PlayerState[] check = { PlayerState.HIDDEN, PlayerState.VISIBLE};

        try {
            for (PlayerState state : players) {
                PlayerState currentCheck = check[new Random().nextInt(2)];

                if (currentCheck == PlayerState.HIDDEN && state == PlayerState.HIDDEN) {
                    System.out.println("АГА, НАШёл!");
                }

                if (currentCheck == PlayerState.VISIBLE && state == PlayerState.VISIBLE) {
                    System.out.println("Не прячешься!");
                }

                if (state == PlayerState.AT_HOME && currentCheck == PlayerState.HIDDEN) {
                    throw new RuntimeException("Мы договаривались дома не прятаться");
                }

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}

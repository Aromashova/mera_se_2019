package task1;

public class Persons {
    private String name;
    private Game game;

    public Persons(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ' ' + "умеет играть в игру \"" + game.getGameDescription() + "\".";
    }
}

package Task_2;

public class Gamer {
    private Names name;
    private Condition condition;

    public Gamer(Names name, Condition condition) {
        this.name = name;
        this.condition = condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Names getName() {
        return name;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}

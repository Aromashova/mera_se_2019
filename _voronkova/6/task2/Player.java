package task2;

public class Player {
    private Member name;
    private PlayerCondition condition;

    public Player(Member name, PlayerCondition condition) {
        this.name = name;
        this.condition = condition;
    }

    public Member getName() {
        return name;
    }

    public PlayerCondition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Игрок " + name.getMemberName() +
                " " + condition.getConditionDescription();
    }

    enum Member{
        TANYA ("Таня"),
        KATYA ("Катя"),
        KARINA ("Карина"),
        KRISTINA ("Kристина"),
        ARINA ("Арина"),
        ALSU ("Алсу"),
        PETYA ("Петя"),
        VOVA ("Вова"),
        MISHA ("Миша"),
        KIRILL ("Кирилл");

        String memberName;

        Member(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberName() {
            return memberName;
        }
    }
}

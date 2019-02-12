package task2;

public class Master {
    private MasterAction masterAction;

    public Master(MasterAction masterAction) {
        this.masterAction = masterAction;
    }

    public MasterAction getMasterAction() {
        return masterAction;
    }

    @Override
    public String toString() {
        return "Ведущий говорит: \"" + masterAction.getActionDescription() + "\"";
    }

    enum MasterAction{
        SAY_HIDE ("Прячешься!"),
        SAY_NOT_NIDE("Не прячешься!");

        String actionDescription;

        MasterAction(String actionDescription) {
            this.actionDescription = actionDescription;
        }

        public String getActionDescription() {
            return actionDescription;
        }
    }
}

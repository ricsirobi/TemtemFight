package Models;

public class PlayerAction {
    private Action action;
    private Temtem source;
    private Temtem target;

    public PlayerAction(Action action, Temtem source, Temtem target) {
        this.action = action;
        this.source = source;
        this.target = target;
    }

    public void execute() {
        action.execute(source, target);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Temtem getSource() {
        return source;
    }

    public void setSource(Temtem source) {
        this.source = source;
    }

    public Temtem getTarget() {
        return target;
    }

    public void setTarget(Temtem target) {
        this.target = target;
    }
}

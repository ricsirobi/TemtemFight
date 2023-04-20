package Models;

public class Action {
    private ActionType type;
    private Temtem user; // a felhasználó által kiválasztott temtem
    private Temtem target; // az ellenfél által kiválasztott temtem (csak támadás esetén szükséges)
    private Ability ability;

    public Action(ActionType type, Temtem user) {
        this.type = type;
        this.user = user;
    }

    public Action(ActionType type, Temtem user, Temtem target) {
        this.type = type;
        this.user = user;
        this.target = target;
    }

    public Action(ActionType type, Temtem user, Ability ability) {
        this.type = type;
        this.user = user;
        this.ability = ability;
    }

    public ActionType getActionType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public Temtem getUser() {
        return user;
    }

    public void setUser(Temtem user) {
        this.user = user;
    }

    public Temtem getTarget() {
        return target;
    }

    public void setTarget(Temtem target) {
        this.target = target;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public void execute(Temtem source, Temtem target)
    {
        System.out.println(source +""+this.ability.getName()+" "+target);
    }
}


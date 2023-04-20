package Models;

public class Ability {
    private String name;
    private String description;

    public Ability(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void use(Temtem own, Temtem other) {
        System.out.println(own + "used "+this.name + " ability on " + other);

    }
}

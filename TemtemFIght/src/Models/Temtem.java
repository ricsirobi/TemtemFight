package Models;

import java.util.ArrayList;
import java.util.List;

public class Temtem {
    private String name;        // a temtem neve
    private int level;          // a temtem szintje
    private int currentHP;      // a temtem jelenlegi életereje

    private int maxHP;          // a temtem maximális életereje

    private int currentStamina; // a temtem jelenlegi energiája

    private int maxStamina;     // a temtem max energiája

    private TemtemType type1;    // a temtem type-ja

    private TemtemType type2;   // a temtem második type-ja
    private int attack;         // a temtem támadási ereje
    private int defense;        // a temtem védelmi ereje
    private int speed;          // a temtem sebessége
    private List<Ability> abilities; // a temtem képességei

    // konstruktor
    public Temtem(String name, int level, int maxHP, int attack, int defense, int speed) {
        this.name = name;
        this.level = level;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.abilities = new ArrayList<>();
    }

    // getterek
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    // setterek
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    // egy képesség hozzáadása a temtemhez
    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }

    // a temtem támadása egy másik temtemre
    public void attack(Temtem other) {
        int damage = (int) Math.round((double) this.attack / other.defense * 10);
        other.currentHP -= damage;
    }

    // egy képesség használata
    public void useAbility(Ability ability, Temtem other) {
        ability.use(this, other);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name).append("\n");
        sb.append("Type: ");
        if (this.type2 == null) {
            sb.append(this.type1).append("\n");
        } else {
            sb.append(this.type1).append(", ").append(this.type2).append("\n");
        }
        sb.append("Health: ").append(this.currentHP).append("/").append(this.maxHP).append("\n");
        sb.append("Stamina: ").append(this.currentStamina).append("/").append(this.maxStamina).append("\n");
        sb.append("Speed: ").append(this.speed).append("\n");
        sb.append("Defense: ").append(this.defense).append("\n");
        sb.append("Abilities: ").append("\n");
        for (Ability ability : abilities) {
            sb.append("  - ").append(ability.getName()).append("\n");
        }
        return sb.toString();
    }



}

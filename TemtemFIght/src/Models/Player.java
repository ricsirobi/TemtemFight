package Models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;           // a játékos neve
    private List<Temtem> activeTemtems;  // az aktív temtemek listája
    private List<Temtem> boxTemtems;    // a dobozban tárolt temtemek listája

    public Player(String name) {
        this.name = name;
        this.activeTemtems = new ArrayList<>(2); // létrehozunk egy üres listát a két aktív temtemnek
        this.boxTemtems = new ArrayList<>(3); // létrehozunk egy üres listát a három dobozban tárolt temtemnek
    }

    // getterek és setterek
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Temtem> getActiveTemtems() {
        return activeTemtems;
    }

    public void setActiveTemtems(List<Temtem> activeTemtems) {
        this.activeTemtems = activeTemtems;
    }

    public List<Temtem> getBoxTemtems() {
        return boxTemtems;
    }

    public void setBoxTemtems(List<Temtem> boxTemtems) {
        this.boxTemtems = boxTemtems;
    }

    // Az aktív temtemek listájához új temtemet adunk
    public boolean addActiveTemtem(Temtem temtem) {
        if (activeTemtems.size() < 2) {  // csak akkor adunk hozzá új temtemet, ha van még hely
            activeTemtems.add(temtem);
            return true;
        }
        return false;
    }

    // Az aktív temtemek listájából eltávolítunk egy temtemet
    public boolean removeActiveTemtem(Temtem temtem) {
        return activeTemtems.remove(temtem);
    }

    // A dobozban tárolt temtemek listájához új temtemet adunk
    public boolean addBoxTemtem(Temtem temtem) {
        if (boxTemtems.size() < 3) {  // csak akkor adunk hozzá új temtemet, ha van még hely
            boxTemtems.add(temtem);
            return true;
        }
        return false;
    }

    // A dobozban tárolt temtemek listájából eltávolítunk egy temtemet
    public boolean removeBoxTemtem(Temtem temtem) {
        return boxTemtems.remove(temtem);
    }

    public boolean hasLiveTemtem()
    {
        return (this.activeTemtems.size() + this.boxTemtems.size()) > 0;
    }
}

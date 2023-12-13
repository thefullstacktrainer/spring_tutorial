// BattleRoyaleGame.java
package com.gamerszone.di.autowire;

public class BattleRoyaleGame {
    private String title;
    private Warrior warrior;

    // Constructor for autowiring
    public BattleRoyaleGame(Warrior warrior) {
        this.warrior = warrior;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}

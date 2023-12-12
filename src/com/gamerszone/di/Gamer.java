package com.gamerszone.di;

public class Gamer {
    private String name;
    private String level;

    // No-argument constructor
    public Gamer() {
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}

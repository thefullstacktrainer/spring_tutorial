package com.gamerszone.di;

public class GameType {
    private String name;

    // Default constructor
    public GameType() {
    }

    // Constructor with parameters
    public GameType(String name) {
        this.name = name;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameType{" +
                "name='" + name + '\'' +
                '}';
    }
}

package com.gamerszone.di;

public class GameLibrary {
    private Game game;

    // Constructor with dependency injection
    public GameLibrary(Game game) {
        this.game = game;
    }

    // Getter for the Game (optional)

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "Library{" +
                "game=" + game +
                '}';
    }
}
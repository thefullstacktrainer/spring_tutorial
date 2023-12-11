package com.gamerszone.di;

public class VideoGame {
    private String title;
    private int releaseYear;
    private GameType gameType;

    // Constructor for constructor-based DI
    public VideoGame(String title, int releaseYear, GameType gameType) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.gameType = gameType;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", gameType=" + gameType +
                '}';
    }
}

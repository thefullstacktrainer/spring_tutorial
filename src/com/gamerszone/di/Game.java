package com.gamerszone.di;

public class Game {
    private String title;
    private String genre;

    // Constructor
    public Game(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    // Getters and setters (optional)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

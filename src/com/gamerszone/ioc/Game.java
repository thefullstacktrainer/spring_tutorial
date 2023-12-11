package com.gamerszone.ioc;

//Game.java

public class Game {
 private String title;
 private int releaseYear;
 private Genre genre;

 // Constructors, getters, and setters

 public Game(String title, int releaseYear, Genre genre) {
     this.title = title;
     this.releaseYear = releaseYear;
     this.genre = genre;
 }

 public Game() {
	super();
}

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

 public Genre getGenre() {
     return genre;
 }

 public void setGenre(Genre genre) {
     this.genre = genre;
 }

 @Override
 public String toString() {
     return "Game{" +
             "title='" + title + '\'' +
             ", releaseYear=" + releaseYear +
             ", genre=" + genre +
             '}';
 }
}

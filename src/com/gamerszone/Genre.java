package com.gamerszone;

//Genre.java

public class Genre {
 private String name;

 // Constructor, getters, and setters

 public Genre(String name) {
     this.name = name;
 }

 public Genre() {
	super();
}

public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 @Override
 public String toString() {
     return "Genre{" +
             "name='" + name + '\'' +
             '}';
 }
}

package com.gamerszone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        // Create a genre
//        Genre actionGenre = new Genre("Action");
//
//        // Create a game with the action genre
//        Game game1 = new Game("Assassin's Creed", 2007, actionGenre);
//
//        // Output game information
//        System.out.println(game1);
    	
        // Create an ApplicationContext and load the configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the game bean from the ApplicationContext
        Game game1 = (Game) context.getBean("assassinsCreed");

        // Output game information
        System.out.println(game1);
    }
}

// AnnotationMain.java
package com.gamerszone.di.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        // Classic ApplicationContext with XML Config
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-annotations.xml");

        // Retrieve the MultiplayerGame bean from the ApplicationContext
        MultiplayerGame multiplayerGame = context.getBean("multiplayerGame", MultiplayerGame.class);

        // Display game information
        System.out.println("Game Title: " + multiplayerGame.getGameTitle());
        System.out.println("Player Name: " + multiplayerGame.getPlayer().getPlayerName());
    }
}

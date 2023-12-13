// JavaConfigMainApp.java
package com.gamerszone.di.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMainApp {
    public static void main(String[] args) {
        // Use AnnotationConfigApplicationContext to read Java configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // Retrieve the OnlineGame bean from the ApplicationContext
        OnlineGame onlineGame = context.getBean(OnlineGame.class);

        // Display game information
        System.out.println("Game Title: " + onlineGame.getGameTitle());
        System.out.println("Player Name: " + onlineGame.getPlayer().getPlayerName());

        // Close the context to trigger the destruction lifecycle of beans
        ((AnnotationConfigApplicationContext) context).close();
    }
}

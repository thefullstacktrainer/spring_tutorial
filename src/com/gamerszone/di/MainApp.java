package com.gamerszone.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Modern ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the video game bean from the ApplicationContext
        VideoGame assassinsCreedGame = (VideoGame) context.getBean("assassinsCreedGame");

        // Output video game information
        System.out.println(assassinsCreedGame);
        
        // Retrieve the video game bean from the ApplicationContext with setter based injection
        VideoGame callOfDutyGame = (VideoGame) context.getBean("callOfDutyGame");

        // Output video game information
        System.out.println(callOfDutyGame);
        
     // Retrieve the Library bean from the ApplicationContext
        GameLibrary library = (GameLibrary) context.getBean("library");

        // Output library information, including the game details
        System.out.println(library);
    }
}

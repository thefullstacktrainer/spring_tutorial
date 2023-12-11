package com.gamerszone.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

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
    	
    	 // Deprecated XmlBeanFactory (not recommended, use ApplicationContext)
        Resource resource = new ClassPathResource("spring-config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        // Retrieve the game bean from the BeanFactory
        Game game1 = (Game) factory.getBean("assassinsCreed");

        // Output game information
        System.out.println(game1);
    	
        // Create an ApplicationContext and load the configuration file
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the game bean from the ApplicationContext
//        Game game1 = (Game) context.getBean("assassinsCreed");

        // Output game information
//        System.out.println(game1);
    }
}

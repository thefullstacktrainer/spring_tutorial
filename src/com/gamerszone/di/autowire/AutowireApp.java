//AutowireApp.java
package com.gamerszone.di.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {
 public static void main(String[] args) {
     // Classic ApplicationContext with XML Config
     ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-autowire.xml");

     // Retrieve the Game bean from the ApplicationContext Autowire byName
     Game1 game = context.getBean("game", Game1.class);

     // Display game information
     System.out.println("Game Title: " + game.getTitle());
     System.out.println("Player Name: " + game.getPlayer().getPlayerName());
     
  // Retrieve the IndianGame bean from the ApplicationContext Autowire byType
     IndianGame indianGame = context.getBean("indianGame", IndianGame.class);

     // Display game information
     System.out.println("Game Title: " + indianGame.getTitle());
     System.out.println("Player Name: " + indianGame.getPlayer().getPlayerName());
     
     
  // Retrieve the BattleRoyaleGame bean from the ApplicationContext Autowire by constructor
     BattleRoyaleGame battleRoyaleGame = context.getBean("battleRoyaleGame", BattleRoyaleGame.class);

     // Display game information
     System.out.println("Game Title: " + battleRoyaleGame.getTitle());
     System.out.println("Warrior Name: " + battleRoyaleGame.getWarrior().getWarriorName());


 }
}

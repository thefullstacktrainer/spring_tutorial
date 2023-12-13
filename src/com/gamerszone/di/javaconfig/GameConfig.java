// GameConfig.java
package com.gamerszone.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    @Bean
    public Player player() {
        Player player = new Player();
        player.setPlayerName("Super Spikey");
        return player;
    }

    @Bean
    public OnlineGame onlineGame() {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.setGameTitle("Fortnite");
        onlineGame.setPlayer(player());
        return onlineGame;
    }
}

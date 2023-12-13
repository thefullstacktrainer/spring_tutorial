// MultiplayerGame.java
package com.gamerszone.di.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MultiplayerGame {
    private String gameTitle;
    private Player player;

    // Constructor for autowiring
    @Autowired
    public MultiplayerGame(@Qualifier("player2") Player player) {
        this.player = player;
    }

    // Getter and Setter methods
    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

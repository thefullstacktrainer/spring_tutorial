// Player.java
package com.gamerszone.di.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Player {
    private String playerName;

    // Getter and Setter methods
    public String getPlayerName() {
        return playerName;
    }

    @Required
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}

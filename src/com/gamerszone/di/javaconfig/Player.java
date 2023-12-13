// Player.java
package com.gamerszone.di.javaconfig;

import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    // Method annotated with @PostConstruct will be invoked after the bean has been constructed.
    @PostConstruct
    public void init() {
        System.out.println("Player bean initialized");
    }

    // Method annotated with @PreDestroy will be invoked before the bean is destroyed.
    @PreDestroy
    public void destroy() {
        System.out.println("Player bean will be destroyed");
    }
}

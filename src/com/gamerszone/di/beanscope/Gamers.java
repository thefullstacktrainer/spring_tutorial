package com.gamerszone.di.beanscope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Gamers implements InitializingBean, DisposableBean {
    private String title;
    private String level;

    // Constructors, getters, and setters

    public Gamers() {
    }

    public Gamers(String title, String level) {
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // InitializingBean and DisposableBean methods

    @Override
    public void afterPropertiesSet() throws Exception {
        // Custom initialization logic
        System.out.println("Initializing Gamers bean using InitializingBean...");
    }

    @Override
    public void destroy() throws Exception {
        // Custom destruction logic
        System.out.println("Destroying Gamers bean using DisposableBean...");
    }

    // @PostConstruct and @PreDestroy methods

    @PostConstruct
    public void init() {
        // Custom initialization logic
        System.out.println("Initializing Gamers bean using @PostConstruct...");
    }

    @PreDestroy
    public void preDestroy() {
        // Custom destruction logic
        System.out.println("Destroying Gamers bean using @PreDestroy...");
    }

    // Other methods

    @Override
    public String toString() {
        return "Gamers{" +
                "title='" + title + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}

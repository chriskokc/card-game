package org.example.player;


import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected Scanner playerInput;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getPlayerInput() {
        return playerInput;
    }

    public abstract String getResponse();

    public abstract void getSnapOpportunity();

}

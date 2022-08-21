package org.example.player;


import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected Scanner playerInput;

    public String getName() {
        return name;
    }

    public Scanner getPlayerInput() {
        return playerInput;
    }

    public abstract String getResponse();

}

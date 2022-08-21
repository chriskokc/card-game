package org.example.player;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        this.name = name;
        this.playerInput = new Scanner(System.in);
    }

    @Override
    public String getResponse() {
        return this.getPlayerInput().nextLine();
    }
}

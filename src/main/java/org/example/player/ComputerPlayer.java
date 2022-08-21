package org.example.player;

import java.util.Scanner;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        this.name = "Bot";
    }

    @Override
    public String getResponse() {
        return "ENTER";
    }
}

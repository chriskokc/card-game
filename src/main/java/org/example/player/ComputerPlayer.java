package org.example.player;


public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        this.name = "Bot";
    }

    @Override
    public String getResponse() {
        return "ENTER";
    }

    @Override
    public void getSnapOpportunity() {
        System.out.println(this.getName() + " win this time:(");
    }
}

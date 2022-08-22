package org.example.player;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        this.name = name;
        this.playerInput = new Scanner(System.in);
    }

    @Override
    public String getResponse() {
        return this.getPlayerInput().nextLine();
    }

    @Override
    public void getSnapOpportunity() {
        System.out.println("Here is the snap opportunity");
        String userResponse = this.getResponse();
        String userName = this.getName();

        // set up a task, i.e wait for user's response
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (userResponse.toLowerCase().equals("snap") ) {
                    System.out.println("Congratulations! " + userName  + ", you win!");
                } else {
                    System.out.println("You miss the Snap opportunity :(");
                }
            }
        };

        // set up time allowed, e.g 2s
        long timeForResponse = TimeUnit.SECONDS.toMillis(2);
        // schedule the timer to run the task
        Timer timer = new Timer();
        timer.schedule(task, timeForResponse);
    }
}

package org.example.game;

import org.example.player.ComputerPlayer;
import org.example.player.HumanPlayer;

import java.util.ArrayList;
import java.util.List;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Snap extends CardGame{

    private List<Card> cardsDrawn = new ArrayList<>();

    public Snap() {
        super();
        this.shuffleDeck();
    }

    public boolean areTwoCardsHavingTheSameSymbol() {
        if (cardsDrawn.size() >= 2) {
            if (cardsDrawn.get(cardsDrawn.size() - 1).getSymbol().equals(cardsDrawn.get(cardsDrawn.size() - 2).getSymbol())) {
                return true;
            }
        }
        return false;
    }

    public void playGame() {
        HumanPlayer user = new HumanPlayer("Tony");
        ComputerPlayer computer = new ComputerPlayer();
        System.out.println("Do you want to play Snap? Please type Y for YES and N for NO.");
        boolean isGameOn = false;


        if (user.getResponse().toLowerCase().equals("y")) {
            System.out.println("Let's play Snap!");
            isGameOn = true;
        }

        while (isGameOn) {
            System.out.println("Please press ENTER to draw a card.");
            if (user.getResponse() != null) {
                this.cardsDrawn.add(this.dealCard());
            }

            System.out.println(user.getName() + " draws: " + this.cardsDrawn.get(this.cardsDrawn.size() - 1));

            if (areTwoCardsHavingTheSameSymbol()) {

                System.out.println("Here is the snap opportunity");

                // set up a task, i.e wait for user's response
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        if (user.getResponse().toLowerCase().equals("snap") ) {
                            System.out.println("Congratulations! " + user.getName() + ", you win!");
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

                isGameOn = false;
                return;
            }

            if (computer.getResponse() != null) {
                this.cardsDrawn.add(this.dealCard());
            }

            System.out.println(computer.getName() + " draws: " + this.cardsDrawn.get(this.cardsDrawn.size() - 1));

            if (areTwoCardsHavingTheSameSymbol()) {
                System.out.println(computer.getName() + " win this time:(");
                isGameOn = false;
                return;
            }

        }


    }

}

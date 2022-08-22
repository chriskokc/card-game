package org.example.game;

import org.example.player.ComputerPlayer;
import org.example.player.HumanPlayer;
import org.example.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Snap extends CardGame{

    private List<Card> cardsDrawn = new ArrayList<>();
    private boolean isGameOn = false;

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

    public boolean isWinnerFound(Player player) {
        if (areTwoCardsHavingTheSameSymbol()) {
            player.getSnapOpportunity();
            this.isGameOn = false;
            return true;
        }
        return false;
    }

    public void playGame() {
        HumanPlayer user = new HumanPlayer();
        String userName = "";
        ComputerPlayer computer = new ComputerPlayer();

        while (userName.equals("")) {
            System.out.println("Hello, what is your name? :)");
            userName = user.getResponse();
        }

        user.setName(Character.toUpperCase(userName.charAt(0)) + userName.substring(1));

        System.out.println("Do you want to play Snap? Please type Y for YES and N for NO.");

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

            if (this.isWinnerFound(user)) {
                // exit while loop if a winner is found
                return;
            }

            if (computer.getResponse() != null) {
                this.cardsDrawn.add(this.dealCard());
            }

            System.out.println(computer.getName() + " draws: " + this.cardsDrawn.get(this.cardsDrawn.size() - 1));

            if (this.isWinnerFound(computer)) {
                // exit while loop if a winner is found
                return;
            }
        }
    }
}

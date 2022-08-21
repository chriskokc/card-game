package org.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play Snap? Please type Y for YES and N for NO.");
        String userInput = scanner.nextLine();
        boolean isGameOn = false;

        if (userInput.toLowerCase().equals("y")) {
            System.out.println("Let's play Snap!");
            isGameOn = true;
        }

        while (isGameOn) {
            System.out.println("Please press ENTER to draw a card.");
            String userPress = scanner.nextLine();
            if (userPress != null) {
                this.cardsDrawn.add(this.dealCard());
            }

            System.out.println("The card you draw is: " + this.cardsDrawn.get(this.cardsDrawn.size() - 1));

            if (areTwoCardsHavingTheSameSymbol()) {
                System.out.println("Congratulations you win!");
                isGameOn = false;
            }

        }


    }

}

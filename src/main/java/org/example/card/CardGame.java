package org.example.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardGame {
    private final List<String> SUITS = new ArrayList<>(Arrays.asList("\u2660", "\u2665", "\u2666", "\u2663"));
    private final List<String> SYMBOLS = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));
    private final List<Integer> VALUE = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    private List<Card> deckOfCards;
    private int topOfDeck = 0;

    public CardGame() {
        this.deckOfCards = this.createDeckOfCards();
    }

    public List<String> getSUITS() {
        return SUITS;
    }

    public List<String> getSYMBOLS() {
        return SYMBOLS;
    }

    public List<Integer> getVALUE() {
        return VALUE;
    }

    public List<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public int getTopOfDeck() {
        return topOfDeck;
    }

    public List<Card> createDeckOfCards() {
        List<Card> deckOfCards = new ArrayList<>();
        for (String suit : this.getSUITS()) {
            for (int i=0; i < this.getSYMBOLS().size(); i++) {
                deckOfCards.add(new Card(suit, this.getSYMBOLS().get(i), this.getVALUE().get(i)));
            }
        }
        return deckOfCards;
    }


    public Card dealCard() {
        Card cardDrawn = this.getDeckOfCards().get(this.getTopOfDeck());
        this.topOfDeck += 1;
        return cardDrawn;
    }

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();

        List<Card> deckOfCard = cardGame.createDeckOfCards();

        for (int i=0; i < deckOfCard.size(); i++) {
            System.out.println(cardGame.dealCard());
        }

    }


}

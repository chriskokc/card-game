package org.example.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardGame {
    private final List<Suits> SUITS = new ArrayList<>(Arrays.asList(Suits.SPADE, Suits.HEART, Suits.CLUB, Suits.DIAMOND));
    private final List<String> SYMBOLS = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));
    private final List<Integer> VALUE = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    protected List<Card> deckOfCards;
    protected int topOfDeck = 0;

    public CardGame() {
        this.deckOfCards = this.createDeckOfCards();
    }

    public List<Suits> getSUITS() {
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

    public void setDeckOfCards(List<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public List<Card> createDeckOfCards() {
        List<Card> deckOfCards = new ArrayList<>();
        for (Suits suit : this.getSUITS()) {
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

    public void sortDeckInNumberOrder() {
        this.setDeckOfCards(this.getDeckOfCards().stream().sorted((a, b) -> a.getValue() - b.getValue()).collect(Collectors.toList()));
    }

    public void sortDeckIntoSuits() {
        this.setDeckOfCards(this.getDeckOfCards().stream().sorted((a, b) -> a.getSuit().compareTo(b.getSuit())).collect(Collectors.toList()));
    }

    public void shuffleDeck() {
        Collections.shuffle(this.deckOfCards);
    }


}

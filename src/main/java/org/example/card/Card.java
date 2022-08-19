package org.example.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    private Suits suit;
    private String symbol;
    private int value;

    public Card(Suits suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public Suits getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(suit: " + this.suit.getSymbol() + ", symbol: " + this.symbol + ", value: " + this.value + ")";
    }
}

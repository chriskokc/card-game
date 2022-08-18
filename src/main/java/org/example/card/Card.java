package org.example.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "(suit: " + this.suit + ", symbol: " + this.symbol + ", value: " + this.value + ")";
    }
}

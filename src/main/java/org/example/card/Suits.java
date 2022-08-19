package org.example.card;

public enum Suits {
    SPADE("\u2660"), HEART("\u2665"), CLUB("\u2666"), DIAMOND("\u2663");

    private String symbol;

    Suits(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

}

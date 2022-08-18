package org.example.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    List<String> suits;
    List<String> symbol;
    List<Integer> value;

    public Card() {
        this.suits = new ArrayList<>(Arrays.asList("\u2660", "\u2665", "\u2666", "\u2663"));
        this.symbol = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));
        this.value = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    }

    public static void main(String[] args) {
        Card card = new Card();
        System.out.println(card.suits);
        System.out.println(card.symbol);
        System.out.println(card.value);
    }


}

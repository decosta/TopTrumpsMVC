package com.project.starwars.toptrumpsMVC.model;

import java.util.*;

public class Player {

    private Stack<Card> cards = new Stack<>();
    private Deck deck = new Deck(cards);
    private String name;

    /**
     * Constructor for the Player class
     * @param  name  The Player's name
     */
    public Player(String name) {
        this.name = name;
    }

    public Card peekAtTopCard() {

        return deck.getCards().peek();
    }

    public Card removeCardFromDeck() {

        return deck.getCards().pop();
    }

    public CategoryType chooseRandomCategory() {

        List<CategoryType> categoryTypes = Arrays.asList(CategoryType.values());

        Random randomCategory = new Random();

        return categoryTypes.get(randomCategory.nextInt(categoryTypes.size()));
    }

    public CategoryType chooseCategory() {

        List<CategoryType> categoryTypes = Arrays.asList(CategoryType.values());



        // Scanner
        // Case
        // Return the category
        return null;
    }

    public Card addToBottomOfDeck() {
        return null;

    }
}

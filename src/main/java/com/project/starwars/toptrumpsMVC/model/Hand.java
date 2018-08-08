package com.project.starwars.toptrumpsMVC.model;

import java.util.Stack;

public class Hand {

    private Stack<Card> hands;

    /**
     * Constructor. Create a Hand object that is initially empty.
     */
    public Hand() {

        Stack hand = new Stack<Hand>();
        this.hands = hand;
    }

    /**
     * Return the number of cards in the hand.
     */
    public int getCardCount(){

        return hands.size();
    }




}

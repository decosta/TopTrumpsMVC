package com.project.starwars.toptrumpsMVC.model;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

    public class Deck {

        private Stack<Card> cards;

        public Deck(Stack<Card> cards) {

            this.cards = cards;

        }

        public Stack<Card> getCards() {
            return cards;
        }

        public int getSizeofDeck() {

            return cards.size();
        }

        /**
         * Shuffles the deck
         */
        public void shuffle() {

            for (int i = 0; i < 6; i++) {
                Collections.shuffle(cards);
            }
        }

        /**
         * Deals the next card
         * @return Pops the card out of the cards stack.
         */
        public Card deal() {

            if(cards.size() > 0) {
                return cards.pop();
            } else {
                throw new EmptyStackException();
            }
        }
    }
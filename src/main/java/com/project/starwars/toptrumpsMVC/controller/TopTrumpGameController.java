package com.project.starwars.toptrumpsMVC.controller;


import com.project.starwars.toptrumpsMVC.model.Card;
import com.project.starwars.toptrumpsMVC.model.Deck;
import com.project.starwars.toptrumpsMVC.model.Player;


import java.io.IOException;
import java.util.Stack;

public class TopTrumpGameController {

    //Reset Deck, Hands, Score and Deal Cards

    /**
     * Starts the initial Top Trump
     * Resets the deck
     * Initialises the players
     */
    public static void start() throws IOException {

        String nameofPlayer;

        System.out.println("Welcome to the Star Wars Top Trumps");


        private static void playerSetup() {



            //  Set up the Players

            Player playerOne = new Player(nameofPlayer);
            Player playerTwo = new Player("Computer");
        }

        private void deckSetUp()
        {
            //Set up the Deck
            JsontoPojoConvert c = new JsontoPojoConvert();
            Deck deck = new Deck(c.readCardsFromJson());
        }


        //Deal to Players
        int x = 0;
        int y = 0;

        while (deck.getSizeofDeck() != 0) {


            player1.add(deck.dealSingleCard());
            player2.add(deck.dealSingleCard());

            deck.shuffle();

    }
}

package com.project.starwars.toptrumpsMVC.controller;
import com.project.starwars.toptrumpsMVC.model.Card;
import com.project.starwars.toptrumpsMVC.model.Deck;
import com.project.starwars.toptrumpsMVC.model.Player;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;


import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;


public class TopTrumpGameController {

    //Reset Deck, Hands, Score and Deal Cards
    /**
     * Starts the initial Top Trump
     * Resets the deck
     * Initialises the players
     */
    private static void playerSetup(){

        //  Set up the Players

        System.out.println("Welcome to the Star Wars Top Trumps");

        Scanner input = new Scanner(System.in);
        System.out.print("Player One - Enter your name: /n");
        String nameofPlayer = input.nextLine();

        Player playerOne = new Player(nameofPlayer);
        Player playerTwo = new Player("Computer");
        }

    private static void deckSetup() throws IOException {

        //Set up the Deck
        JsontoPojoConvert c = new JsontoPojoConvert();
        Deck deck = new Deck(c.readCardsFromJson());

    }

    private static void dealToPlayers() throws IOException {

        Stack<Card> playerHand1 = new Stack<>();
        Stack<Card> playerHand2 = new Stack<>();

        int x = 0;
        int y = 0;

        while (deck.getSizeofDeck() != 0) {


            playerHand1.add(deck.dealSingleCard());
            playerHand2.add(deck.dealSingleCard());

            System.out.println("Player 1: " + playerHand1.get(x).getName());
            System.out.println("Computer Player: " + playerHand2.get(y).getName());
            System.out.println("");

            x++;
            y++;
        }

    }

    public static void startGame() throws IOException {

        playerSetup();
        deckSetup();
    }



}
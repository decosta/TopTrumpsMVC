package com.project.starwars.toptrumpsMVC;


import java.io.IOException;

import static com.project.starwars.toptrumpsMVC.controller.TopTrumpGameController.startGame;

//@SpringBootApplication
public class ToptrumpsMvcApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(ToptrumpsMvcApplication.class, args);
	*/
    public static void main (String args[]) throws IOException {

        startGame();

    }
}

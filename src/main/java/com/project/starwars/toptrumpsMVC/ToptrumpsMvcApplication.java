package com.project.starwars.toptrumpsMVC;

import com.project.starwars.toptrumpsMVC.controller.TopTrumpGameController;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication
public class ToptrumpsMvcApplication {

	/*public static void main(String[] args) {
		SpringApplication.run(ToptrumpsMvcApplication.class, args);
	*/
    public static void main (String args[]) {

        //Call the method to start the game
        TopTrumpGameController.start();
    }
}

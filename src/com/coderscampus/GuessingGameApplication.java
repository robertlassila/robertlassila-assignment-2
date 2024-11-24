package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApplication {

	public static void main(String[] args) {
		Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        
        //next line exists for testing purposes
        //System.out.println(randomNumber);
        
        Scanner scanner = new Scanner(System.in);  
        int guessCounter = 0;
        int maxGuesses = 5;
        System.out.println("Pick a number between 1 and 100");
        
        while (guessCounter < maxGuesses) {
        	int playerInput = scanner.nextInt();
        	
        	if (playerInput < 1 || playerInput > 100) {
        		System.out.println("Your guess is not between 1 and 100, please try again");
        		continue;
        	} 
        	guessCounter++;
        	
        	if (guessCounter == maxGuesses) {
            	System.out.println("Sorry, you didn't get it");
            	System.out.println("The number to guess was " + randomNumber);
            	break;
        	}
        	
        	if (playerInput < randomNumber) {
        		System.out.println("Please pick a higher number");
        	} else if (playerInput > randomNumber) {
        		System.out.println("Please pick a lower number");
        	}else {
        		System.out.println("You win!");
        		break;
        	}
        }
        scanner.close();
        
	}

}



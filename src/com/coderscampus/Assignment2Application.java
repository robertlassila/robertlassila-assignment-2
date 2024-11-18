package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; //the plus one shifts the range to 1-100, instead of 0-99
        //System.out.println(randomNumber); //this was just for testing purposes
        Scanner scanner = new Scanner(System.in);  
        int counter = 0;
        System.out.println("Pick a number between 1 and 100");
        
        while (counter < 5) {
        	String input = scanner.nextLine();
        	Integer convertedInput = Integer.parseInt(input);
        	
        	if ((convertedInput < randomNumber) & (convertedInput >= 1)) {
        		System.out.println("Please pick a higher number");
        		counter++;
        	}
        	else if ((convertedInput > randomNumber) & (convertedInput <= 100)) {
        		System.out.println("Please pick a lower number");
        		counter++;
        	}
        	else if (convertedInput == randomNumber) {
        		System.out.println("You win!");
        		counter = 6;
        	}
        	else {
        		System.out.println("Your guess is not between 1 and 100, please try again");
        	}
        }
        if (counter == 5) {
        	System.out.println("Sorry, you didn't get it");
        	System.out.println("The number to guess was " + randomNumber);
        }
        scanner.close();
        
	}

}



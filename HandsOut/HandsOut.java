package com.HandsOut;

import java.util.Scanner;

import com.Opponents.Daniel;
import com.Opponents.Justin;
import com.Opponents.Michael;
import com.Opponents.User;

public class HandsOut {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput1 = null;
		String userInput2 = null;
		String userInput3 = null;
		String personPlay = null;
		String computerPlay = null;
		String name = null;
		boolean userQuit = false;
		boolean opponentCorrect = false;

		System.out.println("Let's play Rock, Paper, Scissors!");
		System.out.println("What is your name?");
		userInput2 = sc.nextLine();

		User currentPlayer = new User(userInput2, null);

		System.out.println(
				"Hi " + currentPlayer.getName() + ", I hope you are ready to lose!  It's time to pick your opponent.");

		do {
			System.out.println("Who do you want to play: (J)ustin, (M)ichael, or (D)aniel?");
			userInput1 = sc.nextLine();
			switch (userInput1.toUpperCase()) {

			case "J":
				Justin justin = new Justin();
				System.out.println(
						"Today, we will have the epic battle of " + userInput2 + " vs " + justin.getName() + "!");
				opponentCorrect = true;
				break;
			case "D":
				Daniel daniel = new Daniel();
				System.out.println(
						"Today, we will have the epic battle of " + userInput2 + " vs " + daniel.getName() + "!");
				opponentCorrect = true;
				break;
			case "M":
				Michael michael = new Michael();
				System.out.println(
						"Today, we will have the epic battle of " + userInput2 + " vs " + michael.getName() + "!");
				opponentCorrect = true;
				break;
			default:
				System.out.println("Please enter a corresponding letter.");
			}
		} while (!(opponentCorrect));

		do {
			System.out.println(userInput2 + ", what is your move: (R)ock, (P)aper, or (S)cissors?");
			System.out.println("Alternatively, type \'quit\' to quit.");
			userInput3 = sc.nextLine();
			if (userInput3.equalsIgnoreCase("quit")) {
				userQuit = true;
				System.out.println("Thank you for playing.");
				break;
			} else if (userInput3.toUpperCase().equals("R") || userInput3.toUpperCase().equals("P")
					|| userInput3.toUpperCase().equals("S")) {
				personPlay = userInput3.toUpperCase();
			} else {
				System.out.println("Invaild Input");
				continue;
			}

			// currentPlayer.setMyThrow(userInput3);

			switch (userInput1.toUpperCase()) {

			case "J":
				Justin justin = new Justin();
				computerPlay = justin.determiner();
				if (personPlay.equals(computerPlay)) {
					System.out.println("It's a tie!");
				} else if (personPlay.equals("R")) {
					if (computerPlay.equals("S"))
						System.out.println("Rock crushes scissors. You win!!");
					else if (computerPlay.equals("P"))
						System.out.println("Paper beats rock. You lose!!");
				} else if (personPlay.equals("P")) {
					if (computerPlay.equals("S"))
						System.out.println("Scissor cuts paper. You lose!!");
					else if (computerPlay.equals("R"))
						System.out.println("Paper beats rock. You win!!");
				} else if (personPlay.equals("S")) {
					if (computerPlay.equals("P"))
						System.out.println("Scissor cuts paper. You win!!");
					else if (computerPlay.equals("R"))
						System.out.println("Rock breaks scissors. You lose!!");
				}
				break;
			case "D":
				Daniel daniel = new Daniel();
				computerPlay = daniel.determiner();
				if (personPlay.equals(computerPlay)) {
					System.out.println("It's a tie!");
				} else if (personPlay.equals("R")) {
					if (computerPlay.equals("S"))
						System.out.println("Rock crushes scissors. You win!!");
					else if (computerPlay.equals("P"))
						System.out.println("Paper eats rock. You lose!!");
				} else if (personPlay.equals("P")) {
					if (computerPlay.equals("S"))
						System.out.println("Scissor cuts paper. You lose!!");
					else if (computerPlay.equals("R"))
						System.out.println("Paper eats rock. You win!!");
				} else if (personPlay.equals("S")) {
					if (computerPlay.equals("P"))
						System.out.println("Scissor cuts paper. You win!!");
					else if (computerPlay.equals("R"))
						System.out.println("Rock breaks scissors. You lose!!");
				}
				break;
			case "M":
				Michael michael = new Michael();
				computerPlay = michael.determiner();
				if (personPlay.equals(computerPlay)) {
					System.out.println("It's a tie!");
				} else if (personPlay.equals("R")) {
					if (computerPlay.equals("S"))
						System.out.println("Rock crushes scissors. You win!!");
					else if (computerPlay.equals("P"))
						System.out.println("Paper eats rock. You lose!!");
				} else if (personPlay.equals("P")) {
					if (computerPlay.equals("S"))
						System.out.println("Scissor cuts paper. You lose!!");
					else if (computerPlay.equals("R"))
						System.out.println("Paper eats rock. You win!!");
				} else if (personPlay.equals("S")) {
					if (computerPlay.equals("P"))
						System.out.println("Scissor cuts paper. You win!!");
					else if (computerPlay.equals("R"))
						System.out.println("Rock breaks scissors. You lose!!");
				}
				break;
			}

		} while (!(userQuit));
		sc.close();
	}

}

package Assignments;

import java.util.Random;
import java.util.Scanner;

public class StonePaperGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] moves = { "Stone", "paper", "Scissors" };

		String computermove = moves[new Random().nextInt(moves.length)];
		System.out.println("The computer move " + computermove);

		String playermove;
		System.out.println("Type your moves :" + " Stone " + " paper " + " Scissors ");
		playermove = sc.nextLine();

		if (playermove.equals(computermove)) {

			System.out.println("The game is tie ");
		} else if (playermove.equals("Stone")) {
			if (computermove.equals("paper"))
				System.out.println("player wins");
		}
		if (playermove.equals("Scissors")) {
			if (computermove.equals("paper"))
				System.out.println("You lose/Computer wins");
		}

		else if (playermove.equals("paper")) {
			if (computermove.equals("Scissors"))
				System.out.println("Computer wins");
		} 
		else if (playermove.equals("Scissors")) {
			if (computermove.equals("paper"))
				System.out.println("you win!");

		} else if (playermove.equals("paper")) {
			if (computermove.equals("Stone"))
				System.out.print("computer win");
		}
		// else if(playermove.equals("paper")||
		// playermove.equals("Stone")||playermove.equals("Scissors"))
		else
			System.out.println("Invalid  moves");
	}

}

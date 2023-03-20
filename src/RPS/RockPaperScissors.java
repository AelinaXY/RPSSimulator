package RPS;

import java.util.Random;

public class RockPaperScissors {

	private Random rand = new Random();

	public String rpsFight(validRPSMoves userChoice) {
		validRPSMoves n;
		return   ((n = validRPSMoves.values()[this.rand.nextInt(3)])  != userChoice)
			? ((userChoice == validRPSMoves.PAPER && n == validRPSMoves.ROCK)
			|| (userChoice == validRPSMoves.ROCK && n == validRPSMoves.SCISSORS)
			|| (userChoice == validRPSMoves.SCISSORS && n == validRPSMoves.PAPER)
			? "WIN": "LOSS"): "DRAW";}
}

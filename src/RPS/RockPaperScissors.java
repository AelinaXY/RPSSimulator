package RPS;

import java.util.Random;

public class RockPaperScissors {

	private Random rand = new Random();

	public String rpsFight(validRPSMoves userChoice) {
		int rand = this.rand.nextInt(3);

		System.out.println(validRPSMoves.values()[rand]);

		return (validRPSMoves.values()[rand] != userChoice)
				? ((userChoice == validRPSMoves.PAPER && validRPSMoves.values()[rand] == validRPSMoves.ROCK)
						|| (userChoice == validRPSMoves.ROCK && validRPSMoves.values()[rand] == validRPSMoves.SCISSORS)
						|| (userChoice == validRPSMoves.SCISSORS && validRPSMoves.values()[rand] == validRPSMoves.PAPER)
								? "WIN"
								: "LOSS")
				: "DRAW";
	}

}

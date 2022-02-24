package baseball;

public class Computer {
	Baseball computerBaseball = new Baseball();

	Computer(){
		computerBaseball.clearNumber();
		generateNumber();
	}

	private void generateNumber(){
		for(int cnt=0; cnt<Baseball.DIGIT_LENGTH; cnt++){
			computerBaseball.addRandomNumber();
		}
	}

	boolean isCorrect(Baseball player){
		return computerBaseball.checkStrikeAndBall(player);
	}


}

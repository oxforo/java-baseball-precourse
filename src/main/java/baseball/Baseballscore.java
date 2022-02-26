package baseball;

public class Baseballscore {
	private int strikeCount = 0;
	private int ballCount = 0;

	Baseballscore(int strikeCount, int ballCount){
		this.strikeCount = strikeCount;
		this.ballCount = ballCount;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof Baseballscore){
			return (this.strikeCount == ((Baseballscore)obj).getStrikeCount()
				&& this.ballCount == ((Baseballscore)obj).getBallCount());
		}
		return false;
	}

	int getStrikeCount(){
		return strikeCount;
	}

	int getBallCount(){
		return ballCount;
	}
}
package baseball;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class Baseball {
	final static int DIGIT_LENGTH = 3;
	LinkedHashSet<Integer> numbers = new LinkedHashSet<>(DIGIT_LENGTH);

	boolean isRightLength() {
		return numbers.size()==DIGIT_LENGTH;
	}

	boolean isRightInt() {
		Iterator it = numbers.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if (!(obj instanceof Integer)
				|| !(0 < (int)obj && (int)obj < 10)){
				return false;
			}
		}
		return true;
	}

	void addRandomNumber() {
		int randomNumber = pickNumberInRange(1,9);
		boolean isAdd = false;
		while(!isAdd){
			isAdd = numbers.add(randomNumber);
		}

	}

	boolean checkStrikeAndBall(Baseball player) {
		int strikeCount = 0;
		int ballCount = 0;
		List<Integer> numbersList = new ArrayList<>(this.numbers);
		List<Integer> playerNumberList = new ArrayList<>(player.numbers);
		for(int idx=0; idx < Baseball.DIGIT_LENGTH; idx++){
			if(numbersList.get(idx).equals(playerNumberList.get(idx))){
				strikeCount++;
			} else if (player.numbers.contains(numbersList.get(idx))){
				ballCount++;
			}
		}
		printStrikeAndBall(strikeCount,ballCount);
		return strikeCount==3;
	}

	private void printStrikeAndBall(int strikeCount, int ballCount){
		if(ballCount != 0){
			System.out.printf("%d볼 ",ballCount);
		}
		if(strikeCount != 0){
			System.out.printf("%d스트라이크", strikeCount);
		}
		if(ballCount == 0 && strikeCount == 0){
			System.out.print("낫싱");
		}
		System.out.println();
	}

	void clearNumber(){
		this.numbers.clear();
	}
}

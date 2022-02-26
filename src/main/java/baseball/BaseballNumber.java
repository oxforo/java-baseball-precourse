package baseball;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class BaseballNumber {
	final static int DIGIT_LENGTH = 3;
	private LinkedHashSet<Integer> numbers = new LinkedHashSet<>(DIGIT_LENGTH);

	boolean isValidLength() {
		return numbers.size()==DIGIT_LENGTH;
	}

	boolean isValidRange() {
		Iterator it = numbers.iterator();
		while(it.hasNext()){
			Integer element = (Integer)it.next();
			if (!(0 < element && element < 10)){
				return false;
			}
		}
		return true;
	}
	boolean addNumber(int number){
		return numbers.add(number);
	}

	boolean addAllNumber(Collection<Integer> c){
		return numbers.addAll(c);
	}

	int size(){
		return numbers.size();
	}

	Baseballscore checkStrikeAndBall(BaseballNumber baseball) {
		int strikeCount = 0;
		int ballCount = 0;
		List<Integer> numbersList = new ArrayList<>(this.numbers);
		List<Integer> playerNumberList = new ArrayList<>(baseball.numbers);
		for(int idx = 0; idx < BaseballNumber.DIGIT_LENGTH; idx++){
			if(numbersList.get(idx).equals(playerNumberList.get(idx))){
				strikeCount++;
			} else if (baseball.numbers.contains(numbersList.get(idx))){
				ballCount++;
			}
		}

		return new Baseballscore(strikeCount,ballCount);
	}

	void clearNumber(){
		this.numbers.clear();
	}

	void generateNumber(){
		while(numbers.size() < BaseballNumber.DIGIT_LENGTH){
			int randomNumber = pickNumberInRange(1,9);
			numbers.add(randomNumber);
		}
	}

	boolean isEquals(BaseballNumber baseball){
		return checkStrikeAndBall(baseball).equals(new Baseballscore(3,0));
	}

	void setBaseball(Collection<Integer> userInput ){
		numbers.clear();
		numbers.addAll(userInput);

		if( !(isValidLength() && isValidRange())){
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String toString(){
		return numbers.toString();
	}
}

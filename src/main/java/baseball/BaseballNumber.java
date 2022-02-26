package baseball;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class Baseball {
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

	Baseballscore checkStrikeAndBall(Baseball baseball) { // baseball 인스턴스 2개 생성 , 체크리스트 - strike 3개 / ball 3개 / 아무것도 맞지 않을 때 등
		int strikeCount = 0;
		int ballCount = 0;
		List<Integer> numbersList = new ArrayList<>(this.numbers);
		List<Integer> playerNumberList = new ArrayList<>(baseball.numbers);
		for(int idx=0; idx < Baseball.DIGIT_LENGTH; idx++){
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
}

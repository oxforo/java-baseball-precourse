package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaseballTest {

	@Test
	void isValidLengthFalse() {
		//given
		Baseball baseball = new Baseball();
		baseball.addNumber(1);
		baseball.addNumber(2);
		//when
		boolean result = baseball.isValidLength();
		//then
		assertEquals(false,result);
	}

	@Test
	void isValidLengthTrue() {
		//given
		Baseball baseball = new Baseball();
		baseball.addNumber(1);
		baseball.addNumber(2);
		baseball.addNumber(3);
		//when
		boolean result = baseball.isValidLength();
		//then
		assertEquals(true,result);
	}

	@Test
	void isValidRangeFalse() {
		//given
		Baseball baseball = new Baseball();
		baseball.addNumber(13);
		//when
		boolean result = baseball.isValidRange();
		//then
		assertEquals(false,result);
	}

	@Test
	void isValidRangeTrue() {
		//given
		Baseball baseball = new Baseball();
		baseball.addNumber(5);
		//when
		boolean result = baseball.isValidRange();
		//then
		assertEquals(true,result);
	}

	@Test
	void sizeWithTwoElement() {
		//given
		Baseball baseball1 = new Baseball();
		baseball1.addNumber(1);
		baseball1.addNumber(2);
		//when
		int result = baseball1.size();
		//then
		assertEquals(2,result);
	}

	@Test
	void sizeWithThreeElement() {
		//given
		Baseball baseball1 = new Baseball();
		baseball1.addNumber(1);
		baseball1.addNumber(2);
		baseball1.addNumber(3);
		//when
		int result = baseball1.size();
		//then
		assertEquals(3,result);
	}

	@Test
	void checkStrikeAndBallThreeStrike() {
		//	given
		Baseball baseball1 = new Baseball();
		Baseball baseball2 = new Baseball();
		baseball1.addNumber(1);
		baseball1.addNumber(2);
		baseball1.addNumber(3);
		baseball2.addNumber(1);
		baseball2.addNumber(2);
		baseball2.addNumber(3);
		//	when
		 Baseballscore result = baseball1.checkStrikeAndBall(baseball2);
		//	then
		assertEquals(new Baseballscore(3,0), result);
	}

	@Test
	void checkStrikeAndBallOneStrikeTwoBall() {
		//	given
		Baseball baseball1 = new Baseball();
		Baseball baseball2 = new Baseball();
		baseball1.addNumber(1);
		baseball1.addNumber(2);
		baseball1.addNumber(3);
		baseball2.addNumber(1);
		baseball2.addNumber(3);
		baseball2.addNumber(2);
		//	when
		Baseballscore result = baseball1.checkStrikeAndBall(baseball2);
		//	then
		assertEquals(new Baseballscore(1,2), result); 
	}

	@Test
	void checkStrikeAndBallNothing() {
		//	given
		Baseball baseball1 = new Baseball();
		Baseball baseball2 = new Baseball();
		baseball1.addNumber(1);
		baseball1.addNumber(2);
		baseball1.addNumber(3);
		baseball2.addNumber(4);
		baseball2.addNumber(5);
		baseball2.addNumber(6);
		//	when
		Baseballscore result = baseball1.checkStrikeAndBall(baseball2);
		//	then
		assertEquals(new Baseballscore(0,0), result);
	}

	@Test
	void addNumber() {
	}

	@Test
	void addAllNumber() {
	}

	@Test
	void clearNumber() {
	}
}

package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaseballscoreTest {

	@Test
	void testEquals() {
	}

	@Test
	void getStrikeCountOne() {
		//given
		Baseballscore baseballscore = new Baseballscore(1,2);
		//when
		int result = baseballscore.getStrikeCount();
		//then
		assertEquals(1,result);
	}

	@Test
	void getBallCountTwo() {
		//given
		Baseballscore baseballscore = new Baseballscore(1,2);
		//when
		int result = baseballscore.getBallCount();
		//then
		assertEquals(2,result);
	}
}
package baseball;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;

public class BaseballTest {
	@Test
	void 숫자입력_테스트(){
		Baseball baseball = new Baseball();
		baseball.numbers.add(1);
		baseball.numbers.add(2);
		baseball.numbers.add(3);

		System.out.println(
			"baseball.numbers.equals(new LinkedHashSet(Arrays.asList(1,2,3))) : "
				+ baseball.numbers.equals(new LinkedHashSet(Arrays.asList(1,2,3))));
	}

	@Test
	void 개수확인_테스트(){
		Baseball baseball = new Baseball();
		baseball.numbers.add(1);
		baseball.numbers.add(2);

		System.out.println("baseball.isRightLength() : "
			+ baseball.isRightLength());
	}

	@Test
	void 값확인_테스트(){
		Baseball baseball = new Baseball();
		baseball.numbers.add(1);
		baseball.numbers.add(3);

		System.out.println("baseball.isRightInt() : "
			+ baseball.isRightInt());
	}
}

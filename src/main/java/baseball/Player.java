package baseball;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static camp.nextstep.edu.missionutils.Console.*;

public class Player {
	Baseball playerBaseball = new Baseball();

	 void setBaseball(String userInput){
		playerBaseball.numbers.clear();
		playerBaseball.numbers.addAll(
			Stream.of(userInput.split(""))
				.map(Integer::parseInt)
				.collect(Collectors.toList()));
		if( !(playerBaseball.isRightLength() && playerBaseball.isRightInt())){
			throw new IllegalArgumentException();
		}
	}

	boolean restartOrQuit(){
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String userInput = readLine();
		if(userInput.equals("1")){
			return true;
		} else if(userInput.equals("2")){
			return false;
		}
		return restartOrQuit();
	}
}

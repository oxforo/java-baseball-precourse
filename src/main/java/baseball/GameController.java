package baseball;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameController {
	void run(){
		BaseballNumber computer = new BaseballNumber();
		computer.generateNumber();
		BaseballNumber player = new BaseballNumber();
		boolean isFinish = false;

		while(!isFinish){
			System.out.print("숫자를 입력해주세요 : ");
			LinkedHashSet<Integer> userNumbers = userNumberParser(readLine());
			player.setBaseball(userNumbers);
			Baseballscore score = computer.checkStrikeAndBall(player);
			printStrikeAndBall(score);
			isFinish = computer.isEquals(player);
		}
		setGameStatus();
	}

	LinkedHashSet<Integer> userNumberParser(String userInput){
		LinkedHashSet<Integer> parsedInput = new LinkedHashSet<>();
		try {
			parsedInput.addAll(
				Stream.of(userInput.split(""))
					.map(Integer::parseInt)
					.collect(Collectors.toList())
			);
		} catch (IllegalArgumentException e){
			throw new IllegalArgumentException();
		}
		return parsedInput;
	}

	private void setGameStatus() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		if(restartOrQuit()) {
			restart();
		}
	}

	private void restart(){
		run();
	}

	private void printStrikeAndBall(Baseballscore baseballscore){
		int strikeCount = baseballscore.getStrikeCount();
		int ballCount = baseballscore.getBallCount();
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

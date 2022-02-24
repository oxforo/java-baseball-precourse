package baseball;

import static camp.nextstep.edu.missionutils.Console.*;

public class GameController {
	void run(){
		Computer computer = new Computer();
		Player player = new Player();
		boolean isFinish = false;

		while(!isFinish){
			System.out.print("숫자를 입력해주세요 : ");
			String userNumberInput =  readLine();
			player.setBaseball(userNumberInput);
			isFinish = computer.isCorrect(player.playerBaseball);
		}
		setGameStatus(player);
	}

	private void setGameStatus(Player player) {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		if(player.restartOrQuit()) {
			restart();
		}
	}

	private void restart(){
		run();
	}
}

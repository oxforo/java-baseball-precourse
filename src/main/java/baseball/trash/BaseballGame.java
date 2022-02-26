// package baseball;
//
// import static camp.nextstep.edu.missionutils.Console.*;
//
// import java.util.stream.Stream;
//
// public class BaseballGame {
//
// 	 boolean run(){
// 		BaseballNumber baseballGame = new BaseballNumber();
//
// 		while(true){
// 			System.out.print("숫자를 입력해주세요 : ");
// 			String userInputString = readLine();
// 			int[] userInput = getUserIntput(userInputString);
// 			boolean isCorrect = baseballGame.checker(userInput);
// 			if(isCorrect){
// 				break;
// 			}
// 		}
//
// 		return choiceMenu();
// 	}
//
// 	boolean choiceMenu(){
// 		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
// 		String userGameStatus = readLine();
// 		if("1".equals(userGameStatus)){
// 			return true;
// 		}
// 		else if("2".equals(userGameStatus)){
// 			return false;
// 		}
// 		return false;
// 	}
//
// 	int[] getUserIntput(String userInputString) throws IllegalArgumentException{
// 		 int[] userInput = Stream.of(userInputString.split("")).mapToInt(Integer::parseInt).toArray();
// 		 if(userInput.length != 3){
// 			throw new IllegalArgumentException();
// 		 }
// 		 // 서로다른 3개의 숫자인가?
// 		 return userInput;
// 	}
// }

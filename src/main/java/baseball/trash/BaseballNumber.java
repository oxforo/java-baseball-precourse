// package baseball;
//
// import static camp.nextstep.edu.missionutils.Randoms.*;
//
// class BaseballNumber {
// 	final int NUMBERS_LENGTH = 3;
// 	int[] numbers = new int[NUMBERS_LENGTH];
//
// 	BaseballNumber(){
// 		generator();
// 	}
//
// 	void generator(){
// 		for(int idx=0; idx< NUMBERS_LENGTH; idx++){
// 			int randomNumber = pickNumberInRange(1,9);
// 			if(!isContain(randomNumber, numbers)){
// 				numbers[idx] = randomNumber;
// 			} else {
// 				idx--;
// 			}
// 		}
// 	}
//
// 	Boolean isContain(int randomNumber, int[] numbers){
// 		for( int idx=0; idx<numbers.length; idx++){
// 			if(randomNumber == numbers[idx]){
// 				return true;
// 			}
// 		}
// 		return false;
// 	}
//
// 	Boolean checker(int[] userInput){
// 		int strikeCount = 0;
// 		int ballCount = 0;
//
// 		for(int idx=0; idx<NUMBERS_LENGTH; idx++){
// 			if(numbers[idx]==userInput[idx]){
// 				strikeCount++;
// 			}
// 			else if(isContain(numbers[idx],userInput)){
// 				ballCount++;
// 			}
// 		}
// 		checkerPrint(strikeCount,ballCount);
//
// 		if (strikeCount ==3){
// 			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
// 			return true;
// 		}
// 		else{
// 			return false;
// 		}
// 	}
//
// 	void checkerPrint(int strikeCount, int ballCount){
// 		if(ballCount != 0){
// 			System.out.printf("%d볼 ",ballCount);
// 		}
// 		if(strikeCount != 0){
// 			System.out.printf("%d스트라이크 ",strikeCount);
// 		}
// 		if(ballCount ==0 && strikeCount ==0){
// 			System.out.print("낫싱");
// 		}
// 		System.out.println();
// 	}
// }

/* 
 *  Controller.java
 *  version 0.1
 *  2019-11-19
 *  Copyright 2019. hansol. All rights reserved.
 */

package controller;

import model.Card;
import view.View;

public class Controller {

	protected int count=0;
	private Card card = null;
	private View view;
	
	public void run() {
		
		card = new Card();
		view = new View();

		view.startPrint();
		
		while(true) {
			count++;
			view.turnPrint(count);
			
			int input = view.inputNumber(); // 답 입력
			view.processPrint(result(input, card.getAnswer())); // 결과에 따른 메시지 프린트
			
			if(result(input, card.getAnswer()) == 200) {				
				// 다시할 것인지 여부 확인
				if(view.regameInput().equals("n")) {
					break;
				}
			} 
		}
	}
	
	public int result(int input, int answer) {
		if(input == answer) {
			return 200;
		} else if (input > answer){
			return 1;
		} else {
			return -1;
		}
	}
}

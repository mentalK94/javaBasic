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
			
			int input = view.inputNumber(); // �� �Է�
			view.processPrint(result(input, card.getAnswer())); // ����� ���� �޽��� ����Ʈ
			
			if(result(input, card.getAnswer()) == 200) {				
				// �ٽ��� ������ ���� Ȯ��
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

/* 
 * WordGameController.java
 * version 0.1
 * 2019-12-02
 * Copyright 2019. hansol. All rights reserved.
 */

package controller;

import java.util.ArrayList;

import model.Player;
import model.SuggestionWord;
import view.WordGameView;

public class WordGameController {

	private ArrayList<Player> players; // 게임에 참가할 플레이어
	private String preWord;	
	
	public void init() { // 게임 초기화
				
		players = new ArrayList<Player>();
	
		WordGameView.initMessage();		
		int userCount = WordGameView.inputUserCount(); // 유저 수 입력		
		WordGameView.deleteBuffer();
		
		for (int i=0; i<userCount; i++) {
			WordGameView.userNameInputMessage(i);
			players.add(new Player(WordGameView.inputUserName()));  // 이름 입력받아 Player생성 후 players에 add
		}
		
        setPreWord(SuggestionWord.getWord()); // 제시어 삽입	    
	    WordGameView.suggestionWordMessage(preWord); // 제시어 출력
	}
	
	public void run() {
		
		for(int order=0; order<players.size(); order++) {
			
			order = rotateOrder(order, players.size()); // 순서 교체
			
			// 1. 플레이어 입력 창 띄우기
			WordGameView.userWordInputMessage(players, order);
			
			// 2. 플레이어 단어입력
			players.get(order).setWord(WordGameView.inputUserWord());
			
			// 3. 맞는지 확인
			if(WordController.checkSuccess(getPreWord(), players.get(order).getWord())) {
				setPreWord(players.get(order).getWord());  // 시작단어 교체
			} else {
				WordGameView.defeatMessage(players.get(order).getName());
				break;
			}
		}		
	}
	
	public int rotateOrder(int order, int userCount) {
		return order % userCount;
	}

	public String getPreWord() {
		return preWord;
	}

	public void setPreWord(String preWord) {
		this.preWord = preWord;
	}
}

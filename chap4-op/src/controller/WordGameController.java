/* 
 * WordGameController.java
 * version 0.1
 * 2019-12-02
 * Copyright 2019. hansol. All rights reserved.
 */

package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Player;
import model.SuggestionWord;

public class WordGameController {

	private ArrayList<Player> players; // 게임에 참가할 플레이어
	private SuggestionWord suggestionWord; // 게임 시작시 사용할 제시어
	private Scanner scanner;
	
	public void init() { // 게임 초기화
		
		scanner = new Scanner(System.in); // 입력받을 수 있도록 스캐너 생성
		players = new ArrayList<Player>();
		
		System.out.println("끝말잇기 게임에 오신걸을 환영합니다!"); // 게임 시작 메시지
		System.out.print("끝말잇기 게임에 참여할 인원 수를 입력하세요 : "); // 게임 시작 메시지
		
		int userCount = scanner.nextInt(); // 유저 명수 입력
		
		for (int i=0; i<userCount; i++) {
			System.out.print("유저 " + i + " 이름입력 : "); // 이름 입력하라는 메시지 출력 
			players.add(new Player(scanner.nextLine()));  // 이름 입력받아 Player생성 후 players에 add
		}
		
	    String startWord = suggestionWord.getWord(); // 제시어 삽입
	    
	    System.out.println("처음 시작할 단어는 " + startWord + "입니다. ");
	}
	
}

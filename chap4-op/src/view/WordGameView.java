/* 
 * WordGameView.java
 * version 0.1
 * 2019-12-05
 * Copyright 2019. hansol. All rights reserved.
 */

package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Player;

public class WordGameView {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void initMessage() {
		System.out.println("끝말잇기 게임에 오신걸을 환영합니다!"); // 게임 시작 메시지
		System.out.print("끝말잇기 게임에 참여할 인원 수를 입력하세요 : "); // 게임 시작 메시지
	}
	
	public static void userNameInputMessage(int idx) {
		System.out.print("유저 " + idx + " 이름입력 : "); // 이름 입력하라는 메시지 출력 
	}
	
	/* 유저 수 입력 */
	public static int inputUserCount() {		
		return scanner.nextInt();
	}
	
	/* 이름 입력 */
    public static String inputUserName() {
    	return scanner.nextLine();
    }
    
    /* 제시어 출력 */
    public static void suggestionWordMessage(String preWord) {
    	System.out.println("처음 시작할 단어는 " + preWord + "입니다. ");
    }
    
    /* 플레이어 단어 입력 메시지  */
	public static void userWordInputMessage(ArrayList<Player> players, int order) {
		System.out.print(players.get(order).getName() + ">>");
	}
	
	/* 플레이어 단어 입력 메시지  */
	public static String inputUserWord() {
		return scanner.nextLine();
	}
	
	/* 패배 메시지 출력 */
	public static void defeatMessage(String userName) {
		System.out.println(userName+"이 졌습니다.");
	}
	
	/* 버퍼 비우기 */
	public static void deleteBuffer() {
		scanner.nextLine();
	}
}

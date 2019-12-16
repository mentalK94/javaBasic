/* 
 * GameController.java
 * version 0.1
 * 2019-12-16
 * Copyright 2019. hansol. All rights reserved.
 */

package controller;

import model.Bear;
import model.Fish;
import view.OutputView;
import view.OutputViewImpl;

public class GameController {

	private Bear bear;
	private Fish fish;
	private String[][] gameBoard;	
	public static int WIDTH_SIZE = 20;
	public static int HEIGHT_SIZE = 10;
	public static int BEAR_STARTX = 0;
	public static int BEAR_STARTY = 0;
	public static int FISH_STARTX = 12;
	public static int FISH_STARTY = 8;
	public static int BEAR_DISTANCE = 1;
	public static int FISH_DISTANCE = 3;
	
	OutputView outputView = new OutputViewImpl();
	
	/* 게임 초기화 작업 */
	public void init() { 
		outputView.loadingMessageView(); // 게임 로딩메시지
		gameBoard = new String[WIDTH_SIZE][HEIGHT_SIZE];  // 게임보드 생성
		outputView.initGameBoard(gameBoard);  // 게임보드 초기화
		
		this.bear = new Bear(BEAR_STARTX, BEAR_STARTY, BEAR_DISTANCE); // bear 초기화
		this.fish = new Fish(FISH_STARTX, FISH_STARTY, FISH_DISTANCE); // fish 초기화			
		outputView.startMessageView(); // 게임시작 메시지
	}	
	
	public void start() {
		
		while(true) {
			outputView.locationLogger(fish.getX(), fish.getY());
			outputView.locationLogger(bear.getX(), bear.getY());
			// 게임보드 뷰 : 게임 board 출력
			outputView.gameBoardView(gameBoard, fish, bear);			
			// fish move
			fish.move();
			// 키 입력 뷰
			bear.move();
			// 충돌여부 확인
			if(bear.collide(fish)) {
				outputView.winMessageView();
				break;
			}
		}		
	}
	
}

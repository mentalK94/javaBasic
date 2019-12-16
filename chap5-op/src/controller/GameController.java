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
	
	/* ���� �ʱ�ȭ �۾� */
	public void init() { 
		outputView.loadingMessageView(); // ���� �ε��޽���
		gameBoard = new String[WIDTH_SIZE][HEIGHT_SIZE];  // ���Ӻ��� ����
		outputView.initGameBoard(gameBoard);  // ���Ӻ��� �ʱ�ȭ
		
		this.bear = new Bear(BEAR_STARTX, BEAR_STARTY, BEAR_DISTANCE); // bear �ʱ�ȭ
		this.fish = new Fish(FISH_STARTX, FISH_STARTY, FISH_DISTANCE); // fish �ʱ�ȭ			
		outputView.startMessageView(); // ���ӽ��� �޽���
	}	
	
	public void start() {
		
		while(true) {
			outputView.locationLogger(fish.getX(), fish.getY());
			outputView.locationLogger(bear.getX(), bear.getY());
			// ���Ӻ��� �� : ���� board ���
			outputView.gameBoardView(gameBoard, fish, bear);			
			// fish move
			fish.move();
			// Ű �Է� ��
			bear.move();
			// �浹���� Ȯ��
			if(bear.collide(fish)) {
				outputView.winMessageView();
				break;
			}
		}		
	}
	
}

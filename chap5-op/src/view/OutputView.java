/* 
 * OutputView.java
 * version 0.1
 * 2019-12-16
 * Copyright 2019. hansol. All rights reserved.
 */

package view;

import model.Bear;
import model.Fish;
import model.GameObject;

public interface OutputView {

	public void loadingMessageView(); // 로딩메시지 뷰
	public void startMessageView(); // 게임시작 뷰
	public void gameBoardView(String[][] gameBoard, Fish fish, Bear bear); // 게임보드 뷰
	public void initGameBoard(String[][] gameBoard); // 게임보드 초기화
	public void drawGameObject(String[][] gameBoard, GameObject gameObject);
	public void winMessageView(); // 게임종료 메시지 뷰
	public void locationLogger(int x, int y);
}

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

	public void loadingMessageView(); // �ε��޽��� ��
	public void startMessageView(); // ���ӽ��� ��
	public void gameBoardView(String[][] gameBoard, Fish fish, Bear bear); // ���Ӻ��� ��
	public void initGameBoard(String[][] gameBoard); // ���Ӻ��� �ʱ�ȭ
	public void drawGameObject(String[][] gameBoard, GameObject gameObject);
	public void winMessageView(); // �������� �޽��� ��
	public void locationLogger(int x, int y);
}

/* 
 * GameObject.java
 * version 0.1
 * 2019-12-10
 * Copyright 2019. hansol. All rights reserved.
 */

package model;

import controller.GameController;

public abstract class GameObject {
	
	protected int distance; // �� �� �̵��Ÿ�
	protected int x, y; // ���� ��ġ(ȭ�� �� ���� ��ġ)
	
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	
	public boolean collide(GameObject gameObject) {
//		if(this.x == gameObject.getX() && this.y == gameObject.getY()) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (this.x == gameObject.getX() && this.y == gameObject.getY());
	}
	
	public boolean constraintMove(int x, int y) { // ��ü �̵��� ��������
		return ((this.x >= 0 && this.x <= GameController.WIDTH_SIZE) && (this.y >= 0 && this.y <= GameController.HEIGHT_SIZE));
	} 

	public abstract void move(); // ��ü �̵� �޼ҵ� : x or y���� �̵�
	
	public abstract char getShape(); // ��ü ��� �޼ҵ�	
}

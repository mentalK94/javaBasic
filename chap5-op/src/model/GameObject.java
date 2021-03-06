/* 
 * GameObject.java
 * version 0.1
 * 2019-12-10
 * Copyright 2019. hansol. All rights reserved.
 */

package model;

import controller.GameController;

public abstract class GameObject {
	
	protected int distance; // 한 번 이동거리
	protected int x, y; // 현재 위치(화면 맵 상의 위치)
	
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
	
	public boolean constraintMove(int x, int y) { // 객체 이동시 제약조건
		return ((this.x >= 0 && this.x < GameController.WIDTH_SIZE) && (this.y >= 0 && this.y < GameController.HEIGHT_SIZE));
	} 

	public abstract void move(); // 객체 이동 메소드 : x or y값의 이동
	
	public abstract String getShape(); // 객체 모양 메소드	
}

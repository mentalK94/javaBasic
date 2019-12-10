/* 
 * Bear.java
 * version 0.1
 * 2019-12-10
 * Copyright 2019. hansol. All rights reserved.
 */

package model;

import java.util.Random;

import type.Move;

public class Fish extends GameObject {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public void move() {
		// distance 수 만큼 x, y 이동
		Random random = new Random();
		
		for(int i=0; i<distance; i++) {
			int moveCode = random.nextInt(4); // 0~3중에 하나 선택
			
			// 아래 코드 간소화할 방법 생각해보기
			if(moveCode == Move.UP.ordinal()) {
				System.out.println(Move.UP.name());
				this.y++;
			} else if(moveCode == Move.DOWN.ordinal()) {
				System.out.println(Move.DOWN.name());
				this.y--;
			} else if(moveCode == Move.LEFT.ordinal()) {
				System.out.println(Move.LEFT.name());
				this.x--;
			} else if(moveCode == Move.RIGHT.ordinal()) {
				System.out.println(Move.RIGHT.name());
				this.x++;
			} 
		}
		System.out.println("x:"+getX()+", y:"+getY());
	}

	@Override
	public char getShape() {
		return '@';
	}

}

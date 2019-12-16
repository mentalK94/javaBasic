/* 
 * Bear.java
 * version 0.1
 * 2019-12-10
 * Copyright 2019. hansol. All rights reserved.
 */

package model;

import type.Move;
import view.InputView;

public class Bear extends GameObject {
	
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public void move() {
		
		int preX = this.x;
		int preY = this.y;
		
		// inputKey
		String key = InputView.inputKey();
		if(key.equals("w")) {
			System.out.println(Move.UP.name());
			this.y--;
		} else if(key.equals("s")) {
			System.out.println(Move.DOWN.name());
			this.y++;
		} else if(key.equals("a")) {
			System.out.println(Move.LEFT.name());
			this.x--;
		} else if(key.equals("d")) {
			System.out.println(Move.RIGHT.name());
			this.x++;
		}
		
		if(!constraintMove(this.x, this.y)) { // ������ ��� ���
			// error�޽��� ���
			System.out.println("������ ������ϴ�. �̵��� ��ҵ˴ϴ�.");
			this.x = preX;
			this.y = preY;
		}
	}

	@Override
	public char getShape() {
		return 'B';
	}
}

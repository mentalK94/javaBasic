/* 
 *  Card.java
 *  version 0.1
 *  2019-11-19
 *  Copyright 2019. hansol. All rights reserved.
 */

package model;

import java.util.Random;

public class Card {
	
	private int answer;

	public Card() {
		Random random = new Random();
		this.answer = random.nextInt(100); // ·£´ý ¼ö »ý¼º
	}
	
	public int getAnswer() {
		return this.answer;
	}
	
}

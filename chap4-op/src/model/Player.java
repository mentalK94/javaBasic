/* 
 * Player.java
 * version 0.1
 * 2019-12-02
 * Copyright 2019. hansol. All rights reserved.
 */

package model;

public class Player {
	
	private String name; // 유저 명
	private String word; // 유저가 입력한 단어
	
	public Player(String name) {
		this.name = name;
		this.word = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
	
}

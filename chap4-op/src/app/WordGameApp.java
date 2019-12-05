/* 
 * WordGameApp.java
 * version 0.1
 * 2019-12-02
 * Copyright 2019. hansol. All rights reserved.
 */

package app;

import controller.WordGameController;

public class WordGameApp {
	public static void main(String[] args) {
		WordGameController gameController = new WordGameController();
		gameController.init();
		gameController.run();
	}
}

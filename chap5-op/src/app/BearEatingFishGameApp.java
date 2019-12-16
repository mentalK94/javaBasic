package app;

import controller.GameController;

public class BearEatingFishGameApp {
	
	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.init();
		
		gameController.start();
	}

}

package test;

import model.Bear;

public class Test {

	public static void main(String[] args) {
		// System.out.println(Move.RIGHT.ordinal());
		
		// Fish fish = new Fish(0, 0, 3);
		// fish.move();
		
//		String arr[][] = new String[20][10];
//		OutputViewImpl outputViewImpl = new OutputViewImpl();
//		outputViewImpl.gameBoardView(arr, 0, 0, 0, 0);
		Bear bear = new Bear(0, 0, 0);
		bear.move();
		System.out.println(bear.getX()+", "+bear.getY());

	}

}

package test;

import model.Fish;
import type.Move;

public class Test {

	public static void main(String[] args) {
		// System.out.println(Move.RIGHT.ordinal());
		
		Fish fish = new Fish(0, 0, 3);
		fish.move();
	}

}

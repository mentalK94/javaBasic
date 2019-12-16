package view;

import java.util.Scanner;

public class InputViewImpl implements InputView {

	private Scanner scanner = new Scanner(System.in);
	
	public String inputKey() {
		inputKeyMessage();
		return scanner.next();
	}
	
	public void inputKeyMessage() {
		System.out.print("(╩С:(w), го:(s), аб:(a), ©Л:(d) >> ");
	}

}

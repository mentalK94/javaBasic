package view;

import java.util.Scanner;

public class InputViewImpl implements InputView {

	private Scanner scanner = new Scanner(System.in);
	
	public String inputKey() {
		inputKeyMessage();
		return scanner.next();
	}
	
	public void inputKeyMessage() {
		System.out.print("(��:(w), ��:(s), ��:(a), ��:(d) >> ");
	}

}

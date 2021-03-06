/* 
 *  View.java
 *  version 0.1
 *  2019-11-19
 *  Copyright 2019. hansol. All rights reserved.
 */

package view;

import java.util.Scanner;

public class View {

	Scanner scanner = new Scanner(System.in);

	public void startPrint() {
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println("0-99");
	}

	public void turnPrint(int count) {
		System.out.print(count + ">>");
	}

	public int inputNumber() {
		return scanner.nextInt();
	}

	public void processPrint(int isAnswer) {
		if (isAnswer == 200) {
			System.out.println("정답입니다.");
			System.out.print("다시하시겠습니까(y/n)>>");
		} else if (isAnswer == 1) {
			System.out.println("더 낮게");
		} else {
			System.out.println("더 높게");
		}
	}

	public String regameInput() {
		return scanner.next();
	}
}

/* 
 *  App.java
 *  version 0.1
 *  2019-11-19
 *  Copyright 2019. hansol. All rights reserved.
 */
package app;

import controller.Controller;

public class App {

	public static void main(String[] args) {
		
		// 1. "수를 결정하였습니다. 맞추어보세요 0-99" 문구출력
		// 2. 숫자결정
		// 3. 맞는지 판단 
		// 4-1. 맞으면 결과출력 후 재게임 여부 확인
		// 4-2. 틀리면 메시지 출력 후 다시 입력
		Controller controller = new Controller();
		controller.run();

	}

}

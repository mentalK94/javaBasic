/* 
 * WordController.java
 * version 0.1
 * 2019-12-05
 * Copyright 2019. hansol. All rights reserved.
 */

package controller;

public class WordController {
	
	// 끝말잇기 성공여부 확인
	public static boolean checkSuccess(String preWord, String inputWord) {
		if(preWord.charAt(preWord.length()-1) == inputWord.charAt(0)) {  // 끝말잇기에 성공한 경우
			return true;
		} else {
			return false;
		}		
	}
	
}

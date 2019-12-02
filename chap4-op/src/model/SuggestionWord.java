/* 
 * SuggestionWord.java
 * version 0.1
 * 2019-12-02
 * Copyright 2019. hansol. All rights reserved.
 */
package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SuggestionWord {

	private InputStreamReader inputStreamReader = null;
	private FileInputStream fileInputStream = null;
	private BufferedReader bufferedReader = null;
	private String word;
	private String filepath = "D:\\hansol\\JavaBasic\\chap4-op\\words.txt";
	

	public SuggestionWord() {
		// 파일 입출력
		try {
			fileInputStream = new FileInputStream(filepath); // 파일 불러오기
			inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			
			String temp;
			while((temp = bufferedReader.readLine()) != null) {
				System.out.println(temp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		this.word = word;
	}
	
}

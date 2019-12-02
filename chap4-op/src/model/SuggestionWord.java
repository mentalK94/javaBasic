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
import java.util.ArrayList;
import java.util.Random;

public class SuggestionWord {

	private InputStreamReader inputStreamReader = null;
	private FileInputStream fileInputStream = null;
	private BufferedReader bufferedReader = null;
	private ArrayList<String> words; // 제시어 모음
	private String word; // 제시어
	private String filepath = "D:\\hansol\\JavaBasic\\chap4-op\\words.txt"; // 제시어 모음파일 경로
	private Random random;
	private int wordIndex;

	public SuggestionWord() {
		// 파일 입출력
		try {
			fileInputStream = new FileInputStream(filepath); // 파일 불러오기
			inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			words = new ArrayList<String>();
			
			String temp;
			while((temp = bufferedReader.readLine()) != null) {				
				words.add(temp);
			}
			
			random = new Random();
			wordIndex = random.nextInt(words.size());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		this.word = words.get(wordIndex);
	}

	public String getWord() {
		return word;
	}
	
	
}

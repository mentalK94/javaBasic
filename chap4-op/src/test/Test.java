package test;

import controller.WordController;
import model.SuggestionWord;

public class Test {
	public static void main(String[] args) {
/*		SuggestionWord suggestionWord = new SuggestionWord();
		System.out.println(suggestionWord.getWord());*/
		
		WordController wordController = new WordController();
		wordController.checkSuccess("아버지", "지게");
	}
}

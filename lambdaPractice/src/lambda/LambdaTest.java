package lambda;

public class LambdaTest {

	public static void main(String[] args) {
		MyMaxNumber maxValue = (x, y) -> (x >= y) ? x : y;		
		System.out.println(maxValue.getMaxNumber(100, 2200));
		
		StringConCat stringConCat = (s1, s2) -> s1 + ", " + s2;
		System.out.println(stringConCat.concat("한솔", "외국계 기업 가즈아"));
		
		PrintString printString = (str) -> System.out.println(str);
		
		printString.showString(Integer.toString(maxValue.getMaxNumber(3600, 2200)));
		printString.showString(stringConCat.concat("한솔", "영어공부 열심히 하즈아"));
		
	}
}

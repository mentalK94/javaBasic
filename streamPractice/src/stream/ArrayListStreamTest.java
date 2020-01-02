package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> studentList = new ArrayList<String>();
		studentList.add("hansol");
		studentList.add("sungjae");
		studentList.add("yeongsoo");
		studentList.add("jaemin");
		studentList.add("jongyeon");
		studentList.add("jisoo");
		studentList.add("doyeoung");
		studentList.add("doyeoung");
		studentList.add("doyeoung");
		
		Stream<String> stream = studentList.stream();
		stream.forEach(s->System.out.println(s));

		System.out.println("===================");
		// sorting 후 출력
		studentList.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("===================");
		// 이름 길이 sorting후 출력
		studentList.stream().map(s->s.length()).sorted().forEach(s->System.out.println(s));
		System.out.println("===================");
		// 중복제거 후 이름 sorting 출력
		studentList.stream().distinct().sorted().forEach(s->System.out.println(s));
		System.out.println("===================");
		// 중복제거 후 이름길이 sorting후 출력
		studentList.stream().map(s->s.length()).distinct().sorted().forEach(s->System.out.println(s));
	}
}

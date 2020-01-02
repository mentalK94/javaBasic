package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(1, "이순신", 40, 100));
		customerList.add(new Customer(2, "김유신", 20, 100));
		customerList.add(new Customer(3, "홍길동", 13, 50));
		
		// 1. 고객 명단을 출력합니다.
		customerList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
		// 2. 여행의 총 비용을 계산합니다.
		int totalCost = customerList.stream().mapToInt(s->s.getCost()).sum();
		System.out.println(totalCost);
		
		// 3. 고객 중 20세 이상인 사람을 이름으로(가나다순) 정렬하여 출력합니다.
		customerList.stream().filter(s->s.getAge()>=20).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}
}

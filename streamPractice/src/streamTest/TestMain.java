package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(1, "�̼���", 40, 100));
		customerList.add(new Customer(2, "������", 20, 100));
		customerList.add(new Customer(3, "ȫ�浿", 13, 50));
		
		// 1. �� ����� ����մϴ�.
		customerList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
		// 2. ������ �� ����� ����մϴ�.
		int totalCost = customerList.stream().mapToInt(s->s.getCost()).sum();
		System.out.println(totalCost);
		
		// 3. �� �� 20�� �̻��� ����� �̸�����(�����ټ�) �����Ͽ� ����մϴ�.
		customerList.stream().filter(s->s.getAge()>=20).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}
}

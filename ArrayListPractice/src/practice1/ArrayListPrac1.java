/* 
 * ArrayListPrac1.java
 * version 0.1
 * 2019-12-30
 * Copyright 2019. hansol. All rights reserved.
 */

package practice1;

import java.util.ArrayList;

public class ArrayListPrac1 {

	public static void main(String[] args) {
		
		Student stu1 = new Student("���Ѽ�", "1494011", "4", "�Ѽ�");
		Student stu2 = new Student("��μ�", "1392052", "4", "��õ");
		Student stu3 = new Student("�̸���", "1322521", "4", "����");
		Student stu4 = new Student("�ڱǿ�", "1259932", "����", "����");
		
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(stu1);
		studentlist.add(stu2);
		studentlist.add(stu3);
		studentlist.add(stu4);
		
		studentlist.forEach((n) -> n.getInfo());
		
//		for(Student stu : studentlist) {
//			stu.getInfo();
//			System.out.println();
//		}
		
	}
}

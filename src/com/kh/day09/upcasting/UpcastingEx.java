package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("�Ͽ���");
		// p = new Person("");
		p = s;	// ��ĳ����
		
		System.out.println(p.name);
//		����(Object)Ŭ����, �θ�Ŭ���� �͸� ���ٰ��� StudentsŬ������ ����
//		System.out.println(p.grade);
//		System.out.println(p.department);	// Student Ŭ���� �����ϸ� ���� �߻�

		// �ٿ�ĳ���� - ��������ȯ�� ���� Student Ŭ���� ������ �� �ִ�
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
	}
}

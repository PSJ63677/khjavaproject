package com.kh.day09.insof;

public class InstanceOfEx {
		static void print(Person p) {	// print �޼ҵ�� Person�� ������ �����
		// Person p = new Student();	// �� �� �ִ°Ͱ� ��������
//		if(p instanceof Person)
//			System.out.println("Person�Դϴ�");
		if(p instanceof Student)
			System.out.println("Student�Դϴ�");
		if(p instanceof Researcher)
			System.out.println("Researcher�Դϴ�");
		if(p instanceof Professor)
			System.out.println("Professor�Դϴ�");
	}

	public static void main(String [] args) {
//		print(new Person());
		print(new Student());		// ��ĳ����(�θ�Ÿ�� ���۷��� ������ �ڽİ�ü�� ����) �� �����̱� ������ 
		print(new Researcher());	// Person�� ��ӹ��� ��ü�� �����͵� ���� ���� �����
		print(new Professor());		// �ش� Ŭ�������� extends Person(���)������ ������ �����߻�
	}	// Professor�� Researcher�� ��ӹ޾Ҵµ�, Researcher�� Person�� ��ӹ޾ұ� ������ ���� ����
}

package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

//		�̸��� �Է����ּ���. // next()
//		�κ���
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
//		�¾ ���� �Է����ּ���.
//		9		
		System.out.println("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();
//		Ű�� �Է����ּ���.
//		180
		System.out.println("Ű�� �Է����ּ���.");
		double height = sc.nextDouble();
//		������ �Է����ּ���.
//		��
		System.out.println("������ �Է����ּ���.");
		char gender = sc.next().charAt(0);
//		�ּҸ� �Է����ּ���. // nextLine()
//		����� ���α�
		System.out.println("�ּҸ� �Է����ּ���.");
		sc.nextLine();  // ���� ���� (����, ������ �Է¹޴°��� next�� ����)
		String address = sc.nextLine();
		
		System.out.println("�̸��� " + name + " �Դϴ�.");
		System.out.println("�¾ ���� " + month + " �Դϴ�.");
		System.out.println("Ű�� " + height + " �Դϴ�.");
		System.out.println("������ " + gender + " �Դϴ�.");
		System.out.println("�ּҴ� " + address + " �Դϴ�.");
			
		
//		�̸��� �κ����Դϴ�.
//		�¾ ���� 9�Դϴ�.
//		Ű�� 180.0�Դϴ�.
//		���������Դϴ�.
//		�ּҴ� ����� ���α��Դϴ�.

		
	}

}

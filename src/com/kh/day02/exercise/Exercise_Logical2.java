package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args ) {
		// ���� A�� �빮������ �ҹ������� Ȯ���ϼ���
		// �Է��� ������ �빮������ �ҹ������� Ȯ���ϼ���
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���
		// ���� �빮�� Ȯ�� : true
		//char word = 'A';
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		char word = sc.next().charAt(0);
		boolean result = ('A' <= word) && (word <= 'Z');
		System.out.println("���� �빮�� Ȯ�� : " +result);
		
		
		
	}

}

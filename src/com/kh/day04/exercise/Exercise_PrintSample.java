package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void mail(String [] args) {
		// System.out.println���� ���� + ���ڿ� �� ���ڿ��� ��
		System.out.println(1 + "1");
		// ���� + ���� �� ���ڰ� �ƽ�Ű�ڵ� ���ڷ� ���εǾ� ��� ��
		System.out.println('1' + '1');
		// ���� + ���� + ���ڿ� + ���� �� ���������� ���ڿ��� ��
		System.out.println(10 + 20 + "Hello" + 10);
		
		// printf�� ���Ͽ� �˾ƺ���
		// println, print �� �ٹٲ��� ����
		System.out.print("���� �Է� : "); //�ٷ� ���� �Է¹���
		System.out.println("���� �Է� : "); //�ٹٲٰ� �Է¹���
		System.out.printf("���� ��� : %d \n",1); // ,�ڿ� ��³��� �Է��ؾ���
		// : �ڿ� �����ġ�� ����, % ����, ���� ������ - �����϶� d
		// ���� �Ϸ��� \n �Է�
		System.out.printf("���ڿ� ��� : %s", "Hello World"); // ���ڿ��϶� s
		
	}

}

package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args) {
		// indent(�鿩����) ���� : ctrl + shift + f
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		String result = "";		// ������ �ʱ�ȭ
		if(num ==0) {
			result = "0";
		} else if(num > 0) {
			result = "���� ����";			
		} else {
			result = "���� ����";
		}
		
		System.out.println(result + "�Դϴ�.");

	}
	//�����ϳ��� �Է¹޾Ƽ� ���� ��������, 0����, ���� �������� �Ǻ��ϴ� ���α׷� �ۼ�
}

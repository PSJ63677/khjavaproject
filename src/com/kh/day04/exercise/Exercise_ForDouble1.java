package com.kh.day04.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		// 2�� ���� 3��, 2�� ���� 4���� �ǵ��� �ۼ��Ͻÿ�
		//
		// ���� Ǯ����� ������ �����ؾ� ��
		// 1.	 2 * 1 = 2		2 * 2 = 4 	 2 * 3 = 6 ...
		// for(int j = 1; j < 10; j++) {
		//		System.out.print("2 * " + j + " =  + 2*j" + "\t");		
		//
		// 2.	 2 * 1 = 2		3 * 1 = 3 	 4 * 1 = 4 ...
		// for(int j = 2; j < 10; j++) {
		//		System.out.print(j +" * 1" + " = "  + j*1 " + "\t");	
		//
		// 3.	 2 * 1 = 2		3 * 1 = 3	 4 * 1 = 4 ...
		// 	 	 2 * 2 = 4		3 * 2 = 6	 4 * 2 = 8 ...
		//
			for(int j = 1; j < 10; j++) {
				for(int i = 2; i < 10; i++) {
					System.out.print(i + " * " + j + " = " + i*j + "\t");
			}	
			System.out.println();
		}	
	}
}

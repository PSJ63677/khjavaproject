package com.kh.day05.array;

public class Exam_Array {
	public static void main(String [] args ) {
		int num;
		int [] nums = new int[10];	// �迭 ���� : ���̿� ���ȣ + �̸� ���������� �����ش�
		// �Ҵ� : new int[10] �޸𸮿� 10���� ������ �Ҵ� �⺻ 0���� 10�� �Ҵ�� 
		System.out.println(nums[0]);
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		// �ʱ�ȭ : 0���� �Ҵ� �Ǿ��ִ� �⺻���� ���� �־� �ʱ�ȭ
		System.out.println("ù��° �� : " + nums[0]);
		System.out.println("�ι�° �� : " + nums[1]);
		System.out.println("����° �� : " + nums[2]);
		System.out.println("�迭�� ũ�� : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] =100;
			System.out.print(nums[i]);
		}
//		System.out.println();
//		for(int i = 0; i < nums.length; i++) {	
//			System.out.print(nums[i]);
		
	}
}
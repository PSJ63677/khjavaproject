package com.kh.day05.array;

public class Exam_ArraySort {
	public static void main(String [] args) {
		int num1 = 11;
		int num2 = 23;		
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		int temp = num1;	// num1을 temp에 대입해 보존해두지 않으면 값이 바뀜
		num1 = num2;
		num2 = temp;
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		int [] nums = {2, 1, 3};
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 1 2 3 → 3 2 1 순으로 바꾸기
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	
	}
}

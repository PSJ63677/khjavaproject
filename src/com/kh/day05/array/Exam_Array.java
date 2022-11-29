package com.kh.day05.array;

public class Exam_Array {
	public static void main(String [] args ) {
		int num;
		int [] nums = new int[10];	// 배열 선언 : 사이에 대괄호 + 이름 복수형으로 적어준다
		// 할당 : new int[10] 메모리에 10개의 공간을 할당 기본 0값이 10개 할당됨 
		System.out.println(nums[0]);
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		// 초기화 : 0으로 할당 되어있는 기본값에 값을 넣어 초기화
		System.out.println("첫번째 값 : " + nums[0]);
		System.out.println("두번째 값 : " + nums[1]);
		System.out.println("세번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);
		
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

package com.kh.day11.wrapperex;

public class Exam_Wrapper {
	public static void main(String [] args) {
		int num = 0;
//		Integer soo = new Integer(0);	// 과거 작성방식 현재는 사용하지X
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4' , c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c1 + "는 영문자");
		}	
	}
}

package com.kh.day02.variable;

public class TestVariable {
	public static void main(String [] args) {
		// 자료형 변수명 대입연산자 데이터;
		int kh = 34;
		String msg = "Hello World";
		int num; //변수의 선언
		num = 100; //변수의 초기화
		// int num = 100;과 같음
		System.out.println(kh);
		System.out.println("kh");
		//쌍따옴표 붙이면 변수(34)가 아니라 문자열(kh)이 됨, 34 재사용 위해 변수로 선언
		System.out.println(msg);
		System.out.println(num);
		num = 101;
		System.out.println(num);
		num = num +1;
		System.out.println(num);
	}
}

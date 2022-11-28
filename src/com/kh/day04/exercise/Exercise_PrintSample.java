package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void mail(String [] args) {
		// System.out.println에서 정수 + 문자열 → 문자열이 됨
		System.out.println(1 + "1");
		// 문자 + 문자 → 문자가 아스키코드 숫자로 맵핑되어 계산 됨
		System.out.println('1' + '1');
		// 정수 + 정수 + 문자열 + 정수 → 최종적으로 문자열이 됨
		System.out.println(10 + 20 + "Hello" + 10);
		
		// printf에 대하여 알아보자
		// println, print → 줄바꿈의 차이
		System.out.print("정수 입력 : "); //바로 옆에 입력받음
		System.out.println("정수 입력 : "); //줄바꾸고 입력받음
		System.out.printf("정수 출력 : %d \n",1); // ,뒤에 출력내용 입력해야함
		// : 뒤에 출력위치를 지정, % 쓰고, 형식 정해줌 - 정수일때 d
		// 개행 하려면 \n 입력
		System.out.printf("문자열 출력 : %s", "Hello World"); // 문자열일때 s
		
	}

}

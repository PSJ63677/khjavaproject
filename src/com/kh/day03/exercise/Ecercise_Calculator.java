package com.kh.day03.exercise;

import java.util.Scanner;

public class Ecercise_Calculator {
	public static void main(String [] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서 계산하는 계산기 프로그램 작성
		// 정수를 입력해주세요 : 11
		// 정수를 한번더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11
		// 1. 정수하나 입력
		// 2. 정수하나 더 입력
		// 3. 연산자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num1= sc.nextInt();
		System.out.print("정수를 한번더 입력해주세요 : ");
		int num2= sc.nextInt();
		System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
		int result = 0;		// 변수값 초기화
		// 4. 연산자 판별 후 연산 수행		
		if (operator == '+') {
			// 덧셈 연산 수행
			result = num1+num2;
		} else if (operator == '-') {
			// 뺄셈 연산 수행
			result = num1-num2;
		} else if (operator == '*') {
			// 곱셈 연산 수행
			result = num1*num2;
		} else if (operator == '/') {
			// 나눗셈 연산 수행	
			result = num1/num2;
		} else if (operator == '%') {
			// 나머지 연산 수행	
			result = num1%num2;	
		}
		// 5. 결과 출력	
		System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " +result);
		
	}
}



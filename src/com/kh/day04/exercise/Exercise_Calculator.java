package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0); //sc.next()문자열 charAt(0);첫번째 값을 자름
		int result = 0;
		// 연산자 판별 후 연산 수행 그리고 결과 저장
		switch(operator) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' : 
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		}
		System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = "+ result);
		// break는 나가겠다는 것으로 뒤에 적는 코드는 실행 안됨
		// 출력문은 switch-case문 바깥에다 적어야 함
		
	}

}

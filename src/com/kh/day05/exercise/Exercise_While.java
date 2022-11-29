package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 1;
		int sum = 0;
		while(i < 100) {
			sum = sum + i;
			// i++;
			// i = i + 2;
			i += 2; // 복합대입연산자로 표현
			// i = i + 4; → i += 4;
			// i = i * 2; → i *= 2;
		}
		System.out.println("합계 : " + sum);	
	}
	
	public void exercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9사이의 정수 하나 입력 : ");
		int num = sc.nextInt();
		if((num >= 1) && (num <= 9)) {
			int i = 1;
			while(i <= 9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;	// ☆중요☆ 꼭 쓰기
			}
		} else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
	
	private void exercise3() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
        // 입력하신 수의 합은 : 14
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("정수 하나 입력 : ");	// 첫번째 입력값만 받고 실행 안됨 (처음 체크)
		// int input = sc.nextInt();
		int input = 0;
		int sum = 0;
		while(true) {
			System.out.print("정수 하나 입력 : ");	
			input = sc.nextInt();
			// 입력한 값을 더하고, 입력 값이 -1이면 더하지 않고 무한반복 빠져나오기
			if(input == -1) break;
			sum = sum +input;	//sum += input;
		}	
		
//		while(input != -1) {	// num이 -1이 아니면 true → -1이 입력되기 전까지 돈다
//			System.out.print("정수 하나 입력 : ");		
//			input = sc.nextInt();	// -1이 아닐경우 while문 내의 식이 계속 실행된다 (반복 체크)
////			sum = sum + input; // i = i + 2 → i += 2,
//			if(input != -1) {
//			sum += input;
//			}
//		}
		// for(;;) {}
		
		System.out.print("입력하신 수의 합은 : " + sum);
	}
}

package com.kh.day04.exercise;

import java.util.Scanner;

public class Excercise_While3 {
	public static void main(String [] args) {
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

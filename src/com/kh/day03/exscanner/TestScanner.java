package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

//		이름을 입력해주세요. // next()
//		민봉식
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
//		태어난 월을 입력해주세요.
//		9		
		System.out.println("태어난 월을 입력해주세요.");
		int month = sc.nextInt();
//		키를 입력해주세요.
//		180
		System.out.println("키를 입력해주세요.");
		double height = sc.nextDouble();
//		성별을 입력해주세요.
//		남
		System.out.println("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);
//		주소를 입력해주세요. // nextLine()
//		서울시 종로구
		System.out.println("주소를 입력해주세요.");
		sc.nextLine();  // 엔터 제거 (엔터, 공백을 입력받는것이 next와 차이)
		String address = sc.nextLine();
		
		System.out.println("이름은 " + name + " 입니다.");
		System.out.println("태어난 월은 " + month + " 입니다.");
		System.out.println("키는 " + height + " 입니다.");
		System.out.println("성별은 " + gender + " 입니다.");
		System.out.println("주소는 " + address + " 입니다.");
			
		
//		이름은 민봉식입니다.
//		태어난 월은 9입니다.
//		키는 180.0입니다.
//		성별은남입니다.
//		주소는 서울시 종로구입니다.

		
	}

}

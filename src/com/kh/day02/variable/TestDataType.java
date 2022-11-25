package com.kh.day02.variable;

public class TestDataType {
	public static void main(String [] args) {
		// 자료형 변수명 대입연산자 데이터 ;
		// 1. 자료형의 종류
		// 정수, 문자열
		// int , String
		// 정수part
		byte bNum = 127; // -128~127
		short sNum = 32767; // -32768~32767
		int iNum = 2147483647; // -2147483648~2147483647
		long lNum = 2147483648l; // 접미사 l을 붙여야함
		short num = 128;
		// 실수part - 평균 구할때 사용 double을 더 많이 사용
		float fNum = 22.1123f; // 접미사 f를 붙여야함
		double dNum = 23.502;
		// 문자part
		char fChar = 'A'; // 홑따옴표 안에는 1개의 문자만 입력가능
		String sChar = "Hello Java"; // 쌍따옴표 안에는 여러개의 문자(문자열) 입력가능
		//Boolean형 - 연산의 결과 값을 나타내기 위함 true, false
		boolean result = false;
		// 1>0 , 2<1
		
		System.out.println("정수의 값 : " + iNum);
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("실수의 값 : " + dNum);
		System.out.println("문자의 값 : " + fChar);
		System.out.println("문자열의 값 : " + sChar);
		System.out.println("논리의 값 : " + result);
		
		fChar = 66;
		System.out.println("문자에 숫자 : " + fChar);
		fChar = 75;
		System.out.println("문자에 숫자2 : " + fChar);
		// 문자(Char)는 숫자를 저장 가능함 ASCII(아스키)코드에 맵핑 된 문자로 출력
	}
}

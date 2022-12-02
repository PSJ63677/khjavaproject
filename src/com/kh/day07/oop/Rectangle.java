package com.kh.day07.oop;

public class Rectangle {	// 클래스 선언 , 접근지정자 public
	//필드
	public int width;		// 너비, 가로 , 접근지정자 public
	public int height;		// 높이, 세로 , 접근지정자 public

	// 메소드
	// 생성자 - 객체 생성, 객체 초기화(필드초기화)
	public Rectangle() {}	// 생성자 , 접근지정자 public이고 반환형 없음
	
	// 매개변수 있는 생성자(전달값을 받을 수 있는 생성자)
	public Rectangle(int width, int height) {
		this.width = width;			// 초기화
		this.height = height;		// this는 int.width/height 와 구분해주기 위해 씀 (파랑/노랑)
	}
	
	// 반환형이 있는 메소드
	// getArea를 호출한 곳으로 값을 보낸다(리턴한다)\
	public int getArea() {		// 같은 자료형(int)으로 써줌
		int area = width*height;
			return area;
	}
}

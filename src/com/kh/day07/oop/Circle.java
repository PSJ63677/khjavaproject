package com.kh.day07.oop;

public class Circle {	// 클래스 선언(class Circle), 클래스 접근 권한 public
	// 필드
	public int radius;	// 접근 지정자 public		// 여기서 초기화해도 되는데 원칙X
	public String name; // 접근 지정자 public
	
	// 클래스명과 이름이 같은 메소드 : 생성자(생략가능)
	// 객체 생성
	// 필드값을 초기화 (초기화는 생성자에서)
	
	public Circle() {	// 접근 지정자 public
		this.radius = 1;
		this.name = "원";		// 필드 초기화 생성자 내에서 하는게 원칙
	}
	// 반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() {	// 접근지정자 public
		double area = 3.14*radius*radius;	// 메소드의 자료형과 같게 써줌
		return area;
//		return 3.14*radius*radius;		// 둘의 차이는 변수를 썼느냐 안썼느냐의 차이
		
	}
}

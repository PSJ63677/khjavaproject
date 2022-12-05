package com.kh.day09.overriding;

public class Line extends Shape{
	// 오버라이딩
	@Override
	public void draw() {	// 복붙한다
		System.out.println("Line");		// 재정의
	}
}

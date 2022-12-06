package com.kh.day10.abstractex;

abstract class Line extends Shape{	// abstract 적어줌 : 단순상속 / Line 오류 클릭 후 오버라이딩 : 구현상속

//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub		// 구현상속
//	}
	
}


public abstract class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();	//오류발생 class 앞에 abstract적어줘야함
//	abstract public void draw() {}	오류발생
	
}

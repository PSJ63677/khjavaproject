package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p ) {
		//	Shape p = new Line(); 가 있는거나 마찬가지
		p.draw();	// ②
	}
	
	public static void main(String [] args) {
		Line line = new Line();
//		line.draw();
		paint(line);
		paint(new Rect());
		paint(new Circle());	// ①
	}

}

package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;	// 아무것도 안적는게 default
}

public class Exam_Access {
	public static void main(String [] args) {
		Sample s = new Sample();
		s.a = 10;	// public 접근가능
//		s.b = 10;	// private 접근불가능 (is not visible)
		s.c = 10;	// default 접근가능
	}
	
}

package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;	// �ƹ��͵� �����°� default
}

public class Exam_Access {
	public static void main(String [] args) {
		Sample s = new Sample();
		s.a = 10;	// public ���ٰ���
//		s.b = 10;	// private ���ٺҰ��� (is not visible)
		s.c = 10;	// default ���ٰ���
	}
	
}

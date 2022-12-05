package com.kh.day09.overriding;

public class Shape {
	public Shape next;
	public Shape() { next = null; }
	
	public void draw() {	// ищ
		System.out.println("Shape");
	}
}

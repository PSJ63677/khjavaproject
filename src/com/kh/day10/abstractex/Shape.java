package com.kh.day10.abstractex;

abstract class Line extends Shape{	// abstract ������ : �ܼ���� / Line ���� Ŭ�� �� �������̵� : �������

//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub		// �������
//	}
	
}


public abstract class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();	//�����߻� class �տ� abstract���������
//	abstract public void draw() {}	�����߻�
	
}

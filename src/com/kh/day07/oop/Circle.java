package com.kh.day07.oop;

public class Circle {	// Ŭ���� ����(class Circle), Ŭ���� ���� ���� public
	// �ʵ�
	public int radius;	// ���� ������ public		// ���⼭ �ʱ�ȭ�ص� �Ǵµ� ��ĢX
	public String name; // ���� ������ public
	
	// Ŭ������� �̸��� ���� �޼ҵ� : ������(��������)
	// ��ü ����
	// �ʵ尪�� �ʱ�ȭ (�ʱ�ȭ�� �����ڿ���)
	
	public Circle() {	// ���� ������ public
		this.radius = 1;
		this.name = "��";		// �ʵ� �ʱ�ȭ ������ ������ �ϴ°� ��Ģ
	}
	// ��ȯ���� �ִ� �޼ҵ�(��ȯ���� ����, return)
	public double getArea() {	// ���������� public
		double area = 3.14*radius*radius;	// �޼ҵ��� �ڷ����� ���� ����
		return area;
//		return 3.14*radius*radius;		// ���� ���̴� ������ ����� �Ƚ������ ����
		
	}
}

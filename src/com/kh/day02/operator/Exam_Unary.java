package com.kh.day02.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 1+2 , 2x3 , 4/2 �� ���׿�����
		// ���׿����ڡ�
		// a++, a--, b++, b--
		// ++a, --a, ++b, --b
		// a = a+1, a = a-1, b = b+1, b = b-1
		//int a = 1;
		//System.out.println(a++); // ��������(���߿���) ��� ���� ���߿� ����
		//System.out.println(a); // ���⿡ �� ����
		//System.out.println(++a); // ��������(��������)
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("1�� ����");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		
		
		int x = 100;
		int y = 33;
		int z = 0;
		System.out.println("2�� ����");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y;");
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
		
		System.out.println("����������");
		boolean result = true;
		System.out.println("result�� �� : " + result);
		System.out.println("!result�� �� : " + !result); //!=not �ݴ밪���
		
	}
}

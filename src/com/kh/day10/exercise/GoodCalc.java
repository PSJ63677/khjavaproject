package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	public static void main(String [] args) {	// �Ʒ� �� ����� �ٽ� �ۼ��غ���
		GoodCalc calc = new GoodCalc();
		int [] a = {1,2,3,4,5};
		System.out.println("�� : " + calc.add(1, 2));
		System.out.println("�� : " + calc.substract(5,3));
		System.out.println("��� : " + calc.average(a));
	}
	@Override
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	@Override
	public double average (int [] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
	}
}

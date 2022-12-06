package com.kh.day10.exercise;

public class GoodCalc extends Calculator{
	public static void main(String [] args) {	// 아래 다 지우고 다시 작성해보기
		GoodCalc calc = new GoodCalc();
		int [] a = {1,2,3,4,5};
		System.out.println("합 : " + calc.add(1, 2));
		System.out.println("차 : " + calc.substract(5,3));
		System.out.println("평균 : " + calc.average(a));
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

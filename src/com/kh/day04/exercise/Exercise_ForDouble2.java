package com.kh.day04.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		// 0시 0분부터 23시 59분까지 출력하기
		for(int i = 0; i < 24; i++) {
			for(int j =0; j < 60; j++) {
				// System.out.println(i + "시" + j + "분");
				System.out.printf("%2d시 %2d분\n", i, j); // \n 써야 개행 됨
				// %d 사이에 2를 적어주면 두자리 수로 맞춰 줌
			}
		}
	}
}

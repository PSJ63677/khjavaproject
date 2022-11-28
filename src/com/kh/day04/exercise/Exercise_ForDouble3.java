package com.kh.day04.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		// *********
		// **********
		//int num = 1;
		for(int i = 0; i < 10; i++) {
			//for(int j = 0; j < num; j++) {
			for(int j = 0; j < i+1; j++) {	// i+1이 포인트☆
				System.out.print("*");
			}
			System.out.println();
			//num++;
		}
	}
}

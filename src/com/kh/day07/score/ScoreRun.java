package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
		ScoreFunction sFunc = new ScoreFunction();	// 반복문 안에 포함하면 안됨
		ByeBye :
		while(true) {
			int choice = sFunc.printMenu();
//			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				sFunc.inputScore();
				break;
			case 2 :
				sFunc.printScore();
				break;
			case 3 :
				sFunc.goodByeMsg();
				break ByeBye;
			default :
				sFunc.exeptionMsg();
				break;
			}
		}
	}
}

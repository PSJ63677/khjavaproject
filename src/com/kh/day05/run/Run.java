package com.kh.day05.run;

import com.kh.day05.exercise.Exercise_Array;
import com.kh.day05.exercise.Exercise_For;
import com.kh.day05.exercise.Exercise_While;

public class Run {
	public static void main(String [] args) {
		// Exercise_For exFor = new Exercise_For();		// 클래스를 호출해서 쓸수 있다
		// exFor.exercise1();		// exFor.메소드명
		
		//Exercise_While exWhile = new Exercise_While();
		// exWhile.exercise3();	// private으로 되어있어 해당 클래스 내에서만 사용가능
		
		Exercise_Array exArr = new Exercise_Array();
		exArr.exercise5();

	}
}

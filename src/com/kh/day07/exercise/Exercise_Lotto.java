package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또 번호 자동 생성기 프로그램 중복없이 추출하기
		// 결과는 오름차순으로 정렬 1 ~ 45까지 6개 랜덤
		int [] lottos = new int[6];
		Random rand = new Random();	
		// 1. 번호를 뽑는다 x 6번
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45)+1;		// 2. 숫자는 랜덤하다
			// 3. 이미 뽑은것과 비교한다 첫번째부터~ (횟수 점차 증가)
			for(int e =0; e < i; e++) {
				if(lottos[i] == lottos[e]) {
				//중복이면 i--;실행후 빠져나와서 다시뽑게한다
					i--;
					break;
				}
			}
		}
		// 정렬 버블정렬
	for(int i = 0; i < lottos.length-1; i++) {
		for(int e = 0; e < (lottos.length-1)-i; e++) {
			if(lottos[e] > lottos[e+1]) {
				int temp = lottos[e+1];
				lottos[e+1] = lottos[e];
				lottos[e] = temp;
			}
		}
	}
		// 출력
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}

package com.kh.day05.array;

public class Exam_ArraySortSelect {
	public static void main(String [] args ) {
		// 정렬 알고리즘
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		//
		// 선택정렬
		// : 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때는 성능이 좋으나, 양이 많을 때는 급격한 성능 저하
		// 배열을 n번 인덱스 값을 n+1번 ~ 마지막 인덱스까지 비교함
		//
		// {2, 5, 4, 1, 3} 
		//
		/* i = 0 일때
		 * 1 5 4 2 3	// 첫번째 결과
		 * i = 1 일때
		 * 1 2 4 5 3	// 두번째 결과
		 * i = 2 일때
		 * 1 2 3 5 4	// 세번째 결과
		 * i = 3 일때
		 * 1 2 3 4 5	// 두번째 결과
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		int min;	// 인덱스값 저장
		for(int i = 0; i < arrs.length; i++) {
			min = i;	// 가장 작을 때 인덱스값
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {	// 첫번째 턴에서 min값은 2
					min = j;		// 1을 만나면 min값 변경
				}
			}
			int temp = arrs[min];	
			arrs[min] = arrs[i];	
			arrs[i] = temp;		
		}
		for(int i = 0; i < arrs.length; i++ ) {
			System.out.print(arrs[i] + " ");
		}
	}
}

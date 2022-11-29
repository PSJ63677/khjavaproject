package com.kh.day05.array;

public class Exam_ArraySortInsertion {
	public static void main(String [] args) {
		// ���� �˰�����
		// 1. ��������
		// 2. ��������
		// 3. ��������
		//
		// ��������
		// : ���� �˰����� �� �ϳ��� ���� �����ϰ� �⺻�� �Ǵ� �˰�����
		// �迭�� n�� �ε������� 0������ n-1�� �ε������� ��
		// 
		// {2, 5, 4, 1, 3} 
		//
		/* i = 1
		 * 2 5 4 1 3	// 1��° ���
		 * i = 2
		 * 2 5 4 1 3	
		 * 2 4 5 1 3	// 2��° ���
		 * i = 3
		 * 2 4 1 5 3
		 * 2 1 4 5 3
		 * 1 2 4 5 3	// 3��° ���
		 * i = 4
		 * 1 2 4 3 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5	// 4��° ���
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			 for(int j = i; j > 0; j--) {
				 if(arrs[j-1] > arrs[j]) {	// ���������� ������ Ŀ���ϴϱ� ������ -1
//					 int temp = arrs[1];
//					 arrs[1] = arrs[0];
//					 arrs[0] = temp;
					 int temp = arrs[j-1];	// ���ϴ� �ڵ�
					 arrs[j-1] = arrs[j];	// ������ ���� ���� j�� �ٲ���
					 arrs[j] = temp;		// ������ ���� temp������ �ٲ���
				 }
			 }
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζ� ��ȣ �ڵ� ������ ���α׷� �ߺ����� �����ϱ�
		// ����� ������������ ���� 1 ~ 45���� 6�� ����
		int [] lottos = new int[6];
		Random rand = new Random();	
		// 1. ��ȣ�� �̴´� x 6��
		for(int i = 0; i < lottos.length; i++) {
			lottos[i] = rand.nextInt(45)+1;		// 2. ���ڴ� �����ϴ�
			// 3. �̹� �����Ͱ� ���Ѵ� ù��°����~ (Ƚ�� ���� ����)
			for(int e =0; e < i; e++) {
				if(lottos[i] == lottos[e]) {
				//�ߺ��̸� i--;������ �������ͼ� �ٽṵ̂��Ѵ�
					i--;
					break;
				}
			}
		}
		// ���� ��������
	for(int i = 0; i < lottos.length-1; i++) {
		for(int e = 0; e < (lottos.length-1)-i; e++) {
			if(lottos[e] > lottos[e+1]) {
				int temp = lottos[e+1];
				lottos[e+1] = lottos[e];
				lottos[e] = temp;
			}
		}
	}
		// ���
		for(int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
}

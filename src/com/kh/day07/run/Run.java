package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {
	public static void main(String [] args) {
		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();
		
		Person person = new Person();	// ������ ��ü����
//		person.eat();
//		person.sleep();
//		person.walking();
//		person.speak();
		//person.name = "ȫ�浿";
		//person.jobName = "�ǻ�";
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();	
		// ���۷���(=����) ���� ����	=	��ü����, �ݵ�� new Ű���� �̿�
		//									new�� ��ü�� �����ڸ� ȣ���Ѵ�
		
		System.out.print("�ʺ� �Է����ּ��� : ");
		// ��ü�� ��� ����(����� ���� - ��� ����, ��� �޼ҵ�)
		// �ν��Ͻ�(Rectangle Ŭ������ ��ü) 
		rect.width = sc.nextInt();		// ������� ���� : ��ü�� ��� ������ . ���� �Ѵ�
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt();		// ������� ����
		int result = rect.getArea();	// ����޼ҵ� ����
		System.out.print("�簢���� ������ : " + result);
	}
}

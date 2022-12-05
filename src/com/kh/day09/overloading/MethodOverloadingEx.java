package com.kh.day09.overloading;

class Weapon {

	public Weapon() {
	}

	public Weapon(int value) {
		System.out.println(value);
	}

	protected int fire() {
		return 1;
	}

	protected int fire(int steampack) { // �����ε� - �ڱ��ڽ� Ŭ���� ������ ����
		return steampack * 100; // �Ȱ��� �����ϸ� �������Ƿ� �Ű������� ������ �ٸ��� �ϰų�
	}

	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}

	protected int fire(String steampack) { // �Ű������� Ÿ���� �ٸ��� �Ѵ�
		System.out.println(steampack);
		return 1;
	}
}
	class Cannon extends Weapon {
		@Override
		protected int fire() { // �������̵� - ��ӹ��� �ڽ�Ŭ������ �Ȱ��� ����
			return 10;
		}
	}

public class MethodOverloadingEx {
	public static void main(String [] args) {
		System.out.println();
		System.out.println("Hello World");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);
	}
}

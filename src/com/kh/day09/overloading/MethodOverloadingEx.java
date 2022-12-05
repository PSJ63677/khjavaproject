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

	protected int fire(int steampack) { // 오버로딩 - 자기자신 클래스 내에서 복붙
		return steampack * 100; // 똑같이 복붙하면 오류나므로 매개변수의 갯수를 다르게 하거나
	}

	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}

	protected int fire(String steampack) { // 매개변수의 타입을 다르게 한다
		System.out.println(steampack);
		return 1;
	}
}
	class Cannon extends Weapon {
		@Override
		protected int fire() { // 오버라이딩 - 상속받은 자식클래스에 똑같이 복붙
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

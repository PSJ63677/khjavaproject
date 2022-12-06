package com.kh.day10.interfaceex;

public interface PhoneInterface {
//	private String name;
//	Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted
	public String NAME = "";
//	name = "Hello World";	// 작성 X , 상수값 이라서 바뀌지 않음
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();			// public 만써도 되고 public abstract 써도 되고
//	public void prontLogo() {}
//	Abstract methods do not specify a body - {} 사용 X
	abstract void printLogo();					// abstract만 써도 되고
	void displayNumber();						// void만 써도 된다
	public default void showLogo() {	// 디폴트 메소드 - 하위 호환성을 유지, 인터페이스 보완 위해 작성
		System.out.println("** LG **");
	}
}

package com.kh.day10.interfaceex;

public interface PhoneInterface {
//	private String name;
//	Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted
	public String NAME = "";
//	name = "Hello World";	// �ۼ� X , ����� �̶� �ٲ��� ����
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();			// public ���ᵵ �ǰ� public abstract �ᵵ �ǰ�
//	public void prontLogo() {}
//	Abstract methods do not specify a body - {} ��� X
	abstract void printLogo();					// abstract�� �ᵵ �ǰ�
	void displayNumber();						// void�� �ᵵ �ȴ�
	public default void showLogo() {	// ����Ʈ �޼ҵ� - ���� ȣȯ���� ����, �������̽� ���� ���� �ۼ�
		System.out.println("** LG **");
	}
}

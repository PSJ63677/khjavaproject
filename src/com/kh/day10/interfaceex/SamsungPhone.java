package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("===== Samsung =====");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : 011-2345-6789");
	}
	
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}
}

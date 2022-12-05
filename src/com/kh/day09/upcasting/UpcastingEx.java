package com.kh.day09.upcasting;

public class UpcastingEx {
	public static void main(String [] args) {
		Person p;
		Student s = new Student("일용자");
		// p = new Person("");
		p = s;	// 업캐스팅
		
		System.out.println(p.name);
//		조상(Object)클래스, 부모클래스 것만 접근가능 Students클래스는 없다
//		System.out.println(p.grade);
//		System.out.println(p.department);	// Student 클래스 접근하면 오류 발생

		// 다운캐스팅 - 강제형변환을 통해 Student 클래스 접근할 수 있다
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
	}
}

package com.kh.day09.insof;

public class InstanceOfEx {
		static void print(Person p) {	// print 메소드는 Person을 만나야 실행됨
		// Person p = new Student();	// ← 가 있는것과 마찬가지
//		if(p instanceof Person)
//			System.out.println("Person입니다");
		if(p instanceof Student)
			System.out.println("Student입니다");
		if(p instanceof Researcher)
			System.out.println("Researcher입니다");
		if(p instanceof Professor)
			System.out.println("Professor입니다");
	}

	public static void main(String [] args) {
//		print(new Person());
		print(new Student());		// 업캐스팅(부모타입 레퍼런스 변수에 자식객체를 넣음) 된 상태이기 때문에 
		print(new Researcher());	// Person을 상속받은 객체를 가져와도 오류 없이 실행됨
		print(new Professor());		// 해당 클래스에서 extends Person(상속)문구가 빠지면 오류발생
	}	// Professor는 Researcher를 상속받았는데, Researcher가 Person을 상속받았기 때문에 오류 없음
}

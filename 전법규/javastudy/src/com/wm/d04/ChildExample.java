package com.wm.d04;

public class ChildExample {
	public static void main(String[] args) {
		
		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";	// 불가능		// parent 클래스는 child 클래스의 멤버를 사용 할 수 없기 때문 (child 클래스가 parent 클래스의 멤버 사용이 가능)
//		parent.method3();			// 불가능
		
		// 강제 타입 변환
		Child child = (Child)parent;
		
		// child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
		
		
	}	// main
}	// class

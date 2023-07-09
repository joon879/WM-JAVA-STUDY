package com.wm.d07;

public class GenericExample2 {
	public static void main(String[] args) {
		
		// 모든 사람이 신청 가능
		Course2.registerCourse7(new Applicant2<Person2>(new Person2()));
		Course2.registerCourse7(new Applicant2<Worker2>(new Worker2()));
		Course2.registerCourse7(new Applicant2<Student2>(new Student2()));
		Course2.registerCourse7(new Applicant2<MiddleStudent2>(new MiddleStudent2()));
		Course2.registerCourse7(new Applicant2<HighStudent2>(new HighStudent2()));			// 모두 Person2 클래스를 상속
		System.out.println();
		
		// 학생만 신청 가능
//		Course2.registerCourse8(new Applicant2<Person2>(new Person2()));	(x)		
//		Course2.registerCourse8(new Applicant2<Worker2>(new Worker2()));	(x)
		Course2.registerCourse8(new Applicant2<Student2>(new Student2()));
		Course2.registerCourse8(new Applicant2<MiddleStudent2>(new MiddleStudent2()));		// Student2 클래스 상속
		Course2.registerCourse8(new Applicant2<HighStudent2>(new HighStudent2()));			// Student2 클래스 상속
		System.out.println();
		
		// 직장인 및 일반인만 신청 가능
		Course2.registerCourse9(new Applicant2<Person2>(new Person2()));
		Course2.registerCourse9(new Applicant2<Worker2>(new Worker2()));
//		Course2.registerCourse9(new Applicant2<Student2>(new Student2()));		(x)
//		Course2.registerCourse9(new Applicant2<MiddleStudent2>(new MiddleStudent2()));
//		Course2.registerCourse9(new Applicant2<HighStudent2>(new HighStudent2()));
		
		
		
	}	// main

}	// class

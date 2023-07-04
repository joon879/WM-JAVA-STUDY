package com.wm.d05;

public class GenericExample {
	public static void main(String[] args) {
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Person>(new Worker()));
		Course.registerCourse1(new Applicant<Person>(new Student()));
		Course.registerCourse1(new Applicant<Person>(new HighStudent()));
		Course.registerCourse1(new Applicant<Person>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Person>(new Worker()));
	}
}

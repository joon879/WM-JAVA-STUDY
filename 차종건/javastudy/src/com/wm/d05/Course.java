package com.wm.d05;

public class Course {

	public static void registerCourse1(Applicant<?> applicant) {
		// TODO Auto-generated method stub
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
		
	}

	public static void registerCourse2(Applicant<? extends Student> applicant) {
		// TODO Auto-generated method stub
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2을 등록함");
		
	}

	public static void registerCourse3(Applicant<? super Worker> applicant) {
		// TODO Auto-generated method stub
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
		
	}

}

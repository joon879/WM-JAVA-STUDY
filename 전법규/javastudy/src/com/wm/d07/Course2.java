package com.wm.d07;

public class Course2 {
	
	// 모든 사람이면 등록 가능
	public static void registerCourse7(Applicant2<?> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "이(가) Course7을 등록함");
	}
	
	// 학생만 등록 가능
	public static void registerCourse8(Applicant2<? extends Student2> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "이(가) Course8을 등록함");
	}
	
	// 직장인 및 일반인만 등록 가능
	
	public static void registerCourse9(Applicant2<? super Worker2> applicant2) {
		System.out.println(applicant2.kind2.getClass().getSimpleName() + "이(가) Course9를 등록함");
	}

}

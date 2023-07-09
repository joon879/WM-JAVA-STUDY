package com.wm.d07;

public class Applicant<T> {
	
	public T kind;		// T타입 변수 kind
	
	public Applicant(T kind) {		// 매개변수로 T타입 변수 kind를 받는다
		this.kind = kind;
	}

}

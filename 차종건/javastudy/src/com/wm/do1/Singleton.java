package com.wm.do1;

public class Singleton {
	private static Singleton Singleton=new Singleton();
	
	public Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInsSingleton() {
		return Singleton;
	}
}

package com.wm.d02;

public class SupersoniAirplane extends Airplane{
	public static final int normal=1;
	public static final int supersonic=2;
	
	public int flymood=normal;
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (flymood==supersonic) {
			System.out.println("초음속 비행합니다.");
		}else {
		super.fly();
			
		}
	}
	
}

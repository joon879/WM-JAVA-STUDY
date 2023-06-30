package com.wm.do1;

public class car {
	String company="현대자동차";
	String model;
	String color;
	int maxspeed;
	
	car(String model){
		this(model,"은색",250);
	}
	car(String model,String color){
		this(model,color,250);
	}
	car(String model,String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}

}

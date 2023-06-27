package com.wm.d03;

public class Car {
	
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(String model){		// 매개변수가 model 하나
		// 20라인 생성자 호출
		this(model,"은색",250);		// 매개변수로 받은 model과 은색, 250은 고정으로 출력
	}
	
	Car(String model, String color){		// 매개변수가 model,color 두 개
		// 20라인 생성자 호출
		this(model,color,250);		// 매개변수로 받은 model,color와 250은 고정으로 출력
	}
	
	Car(String model, String color, int maxspeed){		// 매개변수가 model,color,maxspeed 세 개
		this.model = model;			// this 다음의 model은 위의 필드에서 선언한 model, = 다음의 model은 매개변수로 받은 model
		// 필드의 있는 model에 매개변수로 받은 model 값을 넣겠다는 의미
		this.color = color;			//	''
		this.maxspeed = maxspeed;	//	''
	}
	
}

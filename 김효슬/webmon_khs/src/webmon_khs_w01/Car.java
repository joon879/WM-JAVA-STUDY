package webmon_khs_w01;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    
    Car(String model) {//생성자 호출
        this(model, "은색", 250);
    }
    
    Car(String model, String color) {//생성자 호출
        this(model, color, 250);
    }
    
    Car(String model, String color, int maxSpeed) {
        // this 생성자 호출, 공통 코드(초기화)
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
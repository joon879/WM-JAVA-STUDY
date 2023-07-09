package webmon_khs_w02;
//제네릭: 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
public class Person {
}
//최상위 클래스 상속
class Worker extends Person {
}

class Student extends Person {
}

class HighStudent extends Student {	
}

class MiddleStudent extends Student {
}
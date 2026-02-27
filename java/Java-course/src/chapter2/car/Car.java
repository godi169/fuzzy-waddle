package chapter2.car;

public class Car {
    //1. 속성
    String name;
    String carModel;

    //2. 생성자
    Car(String name, String carModel) {
        this.name = name;
        this.carModel = carModel;
    }

    //3. 기능
    void drive() {
        System.out.println(name + "[" + this.carModel + "]" + "을 주행합니다.");
    }
}

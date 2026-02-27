package chapter1.method;

import java.util.Scanner;

public class Main {
    static void main() {
        //1. 객체를 객체화(소환)
        Calculator calculator = new Calculator();

        //2 . 메서드(함수)를 호출
        int result = calculator.sum(1, 2);
        System.out.println("result = " + result);
    }
}

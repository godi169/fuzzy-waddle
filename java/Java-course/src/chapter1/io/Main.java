package chapter1.io;

import java.util.Scanner;

public class Main {

    static void main() {
        //출력
        //println 사용
        System.out.println("Hello"); //개행문자 자동포함
        System.out.println("Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.println("Hello\nWorld");

        //입력(Scanner)
        //스캐너 객체를 스캐너형 박스(scanner)
        java.util.Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요:");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        //정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력하세요:");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요:");
        long longBox = scanner.nextInt();
        System.out.println("longBox = " + longBox);

        //소수점
        System.out.print("소수점(double) 입력하세요:");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);
    }


}

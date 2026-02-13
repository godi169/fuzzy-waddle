package chapter1;

import java.util.Scanner;

public class studentInfo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // TODO: 학생 정보 변수들 선언 및 초기화
        String name = ""; // 본인 이름 입력
        int age = 0;      // 본인 나이 입력
        double height = 0.0; // 본인 키 입력
        char grade = '0';    // 학년 입력
        boolean isStudent = true; // 재학중 여부

        // TODO: 학생 정보 출력
        System.out.println("=== 학생 정보 ===");
        // 여기에 출력 코드 작성
        System.out.print("이름을 입력하세요 : ");
        String name1 = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age1 = scanner.nextInt();

        System.out.print("키를 입력하세요 : ");
        double height1 = scanner.nextDouble();

        System.out.print("학년을 입력하세요(1~4) : ");
        char grade1 = scanner.next().charAt(0);


        System.out.println("=== 학생 정보 ===");
        System.out.println("이름 : " + name1);
        System.out.println("나이 : " + age1);
        System.out.println("키 : " + height1 + "cm");
        System.out.println("학년 : " + grade1 + "학년");
        System.out.println("재학중 : " + isStudent);
    }
}

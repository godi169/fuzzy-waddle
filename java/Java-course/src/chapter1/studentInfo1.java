package chapter1;

public class studentInfo1 {
    static void main() {
        // TODO: 학생 정보 변수들 선언 및 초기화
        String name = "최준영"; // 본인 이름 입력
        int age = 31;      // 본인 나이 입력
        double height = 175.8; // 본인 키 입력
        char grade = '4';    // 학년 입력
        boolean isStudent = true; // 재학중 여부

        // TODO: 학생 정보 출력
        System.out.println("=== 학생 정보 ===");
        // 여기에 출력 코드 작성
        System.out.println("이름 : " + name );
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height + "cm");
        System.out.println("학년 : " + grade + "학년");
        System.out.println("재학중 : " + isStudent);
    }
}

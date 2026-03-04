package chapter2.report2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<String> history = new ArrayList<>();

        System.out.println("=== Java 계산기 ===");

        while (true) {
            System.out.println("\n=== 계산기 메뉴 ===");
            System.out.println("1. 계산하기");
            System.out.println("2. 계산 이력 보기");
            System.out.println("3. 이력 지우기");
            System.out.println("0. 종료");
            System.out.print("선택: ");

            String menu = scanner.next();

            switch (menu) {
                case "1": //계산하기
                    calculate(scanner, history);
                    break;
                case "2": //이력보기
                    if (history.isEmpty()) {
                        System.out.println("계산 이력이 없습니다.");
                    } else {
                        System.out.println("=== 계산 이력 ===");
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }
                    break;

                case "3": //이력 지우기
                    history.clear();
                    System.out.println("계산 이력이 모두 삭제되었습니다.");
                    break;

                case "0": //종료
                    System.out.println("계산기를 종료합니다.");
                    scanner.close();
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }

    static void calculate(Scanner scanner, List<String> history) {
        try {
            System.out.print("첫 번째 숫자: ");
            double num1 = scanner.nextDouble();

            System.out.print("연산자(+ - * / % ^ sqrt): ");
            String op = scanner.next();

            double num2 = 0;
            if (!op.equals("sqrt")) {
                System.out.print("두 번째 숫자: ");
                num2 = scanner.nextDouble();
            }

            double result;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("0으로 나머지 연산 불가");
                        return;
                    }
                    result = num1 % num2;
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                case "sqrt":
                    if (num1 < 0) {
                        System.out.println("음수의 제곱근은 계산할 수 없습니다.");
                        return;
                    }
                    result = Math.sqrt(num1);
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    return;
            }

            //결과 출력 + 이력 저장
            String record;
            if (op.equals("sqrt")) {
                record = "sqrt(" + num1 + ") = " + result;
            } else {
                record = num1 + " " + op + " " + num2 + " = " + result;
            }

            System.out.println("결과: " + record);
            history.add(record);

        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해 주세요.");
            scanner.nextLine(); // 입력 버퍼 정리
        }
    }
}

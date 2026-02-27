package Report;


import java.util.Map;
import java.util.Scanner;

public class Vm {
    public static void main(String[] args) {

        // 음료 메뉴 (이름 -> 가격)
        Map<String, Integer> beverages = Map.of(
                "사이다", 1700,
                "콜라", 1900,
                "식혜", 2500,
                "솔의눈", 3000,
                "환타", 2500
        );

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("\n=== 메뉴 ===");
            for (Map.Entry<String, Integer> entry : beverages.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
            }

            // 돈 입력
            System.out.print("\n돈을 넣어주세요(숫자): ");
            int coin = scanner.nextInt();
            scanner.nextLine(); // nextInt() 후 엔터 제거

            // 음료 선택
            System.out.print("음료를 선택하세요(예: 콜라): ");
            String userChoice = scanner.nextLine();

            // 존재 여부 확인
            if (!beverages.containsKey(userChoice)) {
                System.out.println("없는 메뉴입니다.");
            } else {
                int price = beverages.get(userChoice);

                // 돈 부족
                if (coin < price) {
                    int 부족한돈 = price - coin; // (가격 - 넣은 돈) = 부족한 금액
                    System.out.println("돈이 부족합니다. " + 부족한돈 + "원이 더 필요합니다.");
                } else {
                    // 구매 성공
                    int remain = coin - price; // (넣은 돈 - 가격) = 잔돈
                    System.out.println(userChoice + " 구매 완료!");
                    System.out.println("잔돈: " + remain + "원");
                }
            }

            // 계속할지
            System.out.print("\n계속 구매할까요? (Y/N): ");
            String again = scanner.nextLine().trim();
            if (again.equalsIgnoreCase("N")) {
                System.out.println("이용해주셔서 감사합니다!");
                break;
            }
        }
    }

}
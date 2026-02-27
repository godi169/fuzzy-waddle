package chapter2.Report1;


import java.util.Scanner;

public class WordGuessGame {
    private final WordRepository repo;
    private final int maxWrong;

    public WordGuessGame(WordRepository repo, int maxWrong) {
        this.repo = repo;
        this.maxWrong = maxWrong;
    }

    public void start() {
        String answer = repo.randomWord();
        GameState state = new GameState(answer, maxWrong);

        System.out.println("=== 단어 맞추기 게임 ===");
        System.out.println("\n현재 남은 기회: " + state.remainingChances());
        System.out.println("정답은 " + state.length() + "자리 입니다.");
        System.out.println("[" + state.revealedString() + "]\n");

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                // 종료 조건
                if (state.isSolved()) {
                    System.out.println("\n🎉정답입니다! " + state.getAnswer());
                    break;
                }
                if (state.isGameOver()) {
                    System.out.println("\n💀 게임오버! 정답: " + state.getAnswer());
                    break;
                }

                System.out.println("\n현재 남은 기회: " + state.remainingChances());
                System.out.print("A~Z 중 하나를 입력해주세요 ");

                String raw = sc.nextLine();

                // 입력 검증
                InputValidator.ValidationResult vr = InputValidator.validate(raw, state);
                if (!vr.ok) {
                    System.out.println(vr.message);
                    continue;
                }

                char guess = vr.value;
                state.addUsed(guess);

                // d/e 처리
                boolean found = state.applyGuess(guess);
                if (found) {
                    System.out.println("[" +state.revealedString() + "]");
                } else {
                    System.out.println("❌ 정답에 포함된 알파벳이 아닙니다. 기회가 1 차감됩니다. " + state.getWrongCount() + "/" + state.getMaxWrong() + ")\n");
                    System.out.println("[" + state.revealedString() + "]");
                }

            }
        }
    }
}


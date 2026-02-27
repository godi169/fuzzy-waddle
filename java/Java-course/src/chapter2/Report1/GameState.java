package chapter2.Report1;


import java.util.*;

public class GameState {
    private final String answer;
    private final char[] revealed;
    private final Set<Character> usedLetters = new HashSet<>();
    private int wrongCount = 0;
    private final int maxWrong;

    public GameState(String answer, int maxWrong) {
        this.answer = answer;
        this.maxWrong = maxWrong;
        this.revealed = new char[answer.length()];
        Arrays.fill(this.revealed, '_');
    }

    public String getAnswer() { return answer; }
    public int getWrongCount() { return wrongCount; }
    public int getMaxWrong() { return maxWrong; }
    public int remainingChances() { return maxWrong - wrongCount; }
    public boolean isGameOver() { return wrongCount >= maxWrong; }

    public boolean isSolved() {
        for (char c : revealed) if (c == '_') return false;
        return true;
    }

    public boolean hasUsed(char c) {
        return usedLetters.contains(c);
    }

    public void addUsed(char c) {
        usedLetters.add(c);
    }

    /** 정답에 포함된 글자면 해당 위치 전부 공개하고 true, 아니면 오답 증가 후 false */
    public boolean applyGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guess) {
                revealed[i] = guess;
                found = true;
            }
        }
        if (!found) wrongCount++;
        return found;
    }

    public String revealedString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < revealed.length; i++) {
            sb.append(revealed[i]);
            if (i < revealed.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    public int length() {
        return answer.length();
    }
}


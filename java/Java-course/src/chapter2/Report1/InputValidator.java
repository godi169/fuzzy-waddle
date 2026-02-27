package chapter2.Report1;


import java.util.Locale;

public class InputValidator {

    /** 입력 문자열을 검증하고, 유효하면 대문자 알파벳 1글자를 반환 */
    public static ValidationResult validate(String raw, GameState state) {
        if (raw == null) return ValidationResult.invalid("❗ 입력이 비어있습니다.");

        String input = raw.trim().toUpperCase(Locale.ROOT);

        // b. 한 글자가 아니라면 다시 입력
        if (input.length() != 1) {
            return ValidationResult.invalid("❗ 한 글자만 입력하세요.");
        }

        char ch = input.charAt(0);

        // a. A-Z 사이의 알파벳이 아니라면 다시 입력
        if (ch < 'A' || ch > 'Z') {
            return ValidationResult.invalid("❗ A~Z 알파벳만 입력하세요.");
        }

        // c. 이미 입력했던 알파벳이라면 다시 입력
        if (state.hasUsed(ch)) {
            return ValidationResult.invalid("❗ 이미 입력한 알파벳입니다.");
        }

        return ValidationResult.valid(ch);
    }

    // 결과 객체(간단 DTO)
    public static class ValidationResult {
        public final boolean ok;
        public final char value;      // ok일 때만 의미 있음
        public final String message;  // ok=false일 때 안내 메시지

        private ValidationResult(boolean ok, char value, String message) {
            this.ok = ok;
            this.value = value;
            this.message = message;
        }

        public static ValidationResult valid(char c) {
            return new ValidationResult(true, c, null);
        }

        public static ValidationResult invalid(String msg) {
            return new ValidationResult(false, '\0', msg);
        }
    }
}


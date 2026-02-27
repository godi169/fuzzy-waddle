package chapter1.operator;

public class Main {
    static void main() {
        int a = 10;
        int b = 3;
        
        //기본적인 사칙연산
        int sum = a + b;
        System.out.println("sum = " + sum);
        
        int sub = a - b;
        System.out.println("sub = " + sub);
        
        int mul = a * b;
        System.out.println("mul = " + mul);
        
        //나눗셈
        // 10 / 3
        int div1 = a / b;
        System.out.println("div1 = " + div1);

        // a / 3.0
        double div2= a / 3.0;
        System.out.println("div2 = " + div2);

        //모듈러 연산자(나머지 연산) - %
        int mod = 10 % 3;
        System.out.println("mod = " + mod);
        
        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);
        
        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);

        // 시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        //짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);

        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);

        //대입 연산자
        int num = 5;
        
        //복합 대입 연산자
        num += 3; // num  = num + 3;
        System.out.println("num = " + num);
        
        num -= 2; // num = num - 2;
        System.out.println("num = " + num);
        
        num *= 2; // num = num * 2;
        System.out.println("num = " + num);
        
        num /= 3; // num = num / 3;
        System.out.println("num = " + num);
        
        num %= 3; // num = num % 3;
        System.out.println("num = " + num);
        
        //증감 연산자
        //후위 연산(i++)
        num = 1;
        num++;
        num++;
        num--;
        num--;
        System.out.println("num = " + num);
        
        //전위 연산(++i) - 연산 후 값이 활용됩니다.
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));
        
        //후위 연산
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);

        //비교연산자
        //같음연산자(==) 같으면 true, 다르면 false
        System.out.println("10 == 10 " + (10 ==  10));

        //다른 연산자(!=) 다르면 true, 같으면 false
        System.out.println("(10 != 5) = " + (10 != 5));
        
        //크기 비교 연산자(<, >, <=, >=)
        System.out.println("(10 < 5) = " + (10 < 5));
        System.out.println("(10 >= 10) = " + (10 >= 5));
        System.out.println("(10 <= 5) = " + (10 <= 5));

        //논리 연산자
        //AND 연산(&&) - 두 조건이 모두 참일때 true를 반환합니다.
        System.out.println("(true && true) = " + (true && true));
        int age = 20;
        boolean isStudent = true;
        System.out.println(":::" + ((age > 18) && isStudent));
        
        //OR 연산(||) - 두 조건 중 하나라도 참이라면 true를 반환합니다.
        System.out.println("(false || true) = " + (false || true));

        //NOT 연산(!) - true -> false, false -> true.
        System.out.println("(!true) = " + (!true));

        //연산자 우선순위
        boolean flag = ((10 + 5) > 12) && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        //논리 연산자 우선순위
        boolean result = true || (false && false);
        System.out.println("result = " + result);

        boolean result2 = true || (false && !false);
        System.out.println("result2 = " + result2);
        
        //문자열 비교(equals()를 사용할 것)
        String text = "Hello";
        String text2 = "Hello";
         //나쁜예 : (text == text2)
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual);
    }
}

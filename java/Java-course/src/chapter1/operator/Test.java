package chapter1.operator;

public class Test {
    static void main() {
        int a = 15;
        int b = 4;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div1 = a / b;
        double div2 =  a / 4.0;

        System.out.println("덧셈 결과 : " +  sum);
        System.out.println("뺄셈 결과 : " + sub);
        System.out.println("곱셈 결과 : " + mul);
        System.out.println("나눗셈 결과 : " + div1);
        System.out.println("나머지 결과 : " + div2 );
    }
}

package chapter1.loop;

public class Test1 {
    static void main() {
        for(int dan = 2; dan <= 9; dan++) {
            System.out.println("====" + dan + "단====");
            for(int i = 1; i <= 9; i++) {
                System.out.println(dan + "x" + i + "=" + (dan * i));
            }
        }
    }
}

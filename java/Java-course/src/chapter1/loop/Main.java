package chapter1.loop;

public class Main {
    static void main() {
        //로봇한테 10번 인사 반복
        /*System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요!");*/
        //10번 반복'

        //반복문(for문 + break문 + continue문)
        /*int customers = 5;

        for (int i = 1; i <= customers; i++) {
            if(i == 4) {
                break;
            }
            if (i == 2){
                continue;
            }
            System.out.println(i + "번째 손님, 안녕하세요!");
        }*/
        
        //반복문(while)
        /*int i = 1;
        while (i <= 10) {
            System.out.println(" 안녕하세요. ");
            i++;
        }*/

        //반복문(do-while)
        int i = 1;
        do {
            System.out.println(" 안녕하세요. ");
            i++;

        } while (i <= 10);

    }
}

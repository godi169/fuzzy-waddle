package chapter1.array;

public class Array {
    static void main() {
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j]) {
                    System.out.println("검은돌(●) 위치 : (" + i + "," + j + ")" );
                }
            }
        }

        int[] numbers = {2, 5, 8};

        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("누적합 : " + sum);
    }
}

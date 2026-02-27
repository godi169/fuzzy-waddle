package chapter2.Report1;


public class Main {
    public static void main(String[] args) {
        WordRepository repo = new WordRepository();
        WordGuessGame game = new WordGuessGame(repo, 9); // 9번 틀리면 게임오버
        game.start();
    }
}


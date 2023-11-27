package hexlet.code;

import hexlet.code.games.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        showGameMenu();
    }
    public static void showGameMenu() {
        Scanner sc = new Scanner(System.in);
        int answer;
        System.out.println("Please enter the game number and press Enter.");
        Game.getGameMenu().forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
        try {
            answer = sc.nextInt();
            System.out.println("Your choice: " + answer);
            Game.startGame(answer);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            showGameMenu();
        }
    }
}

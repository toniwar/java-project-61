package hexlet.code;

import hexlet.code.games.GameType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static String player = "";
    public static void main(String[] args) {
        showGameMenu();
    }
    public static void showGameMenu() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        try {
            answer = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            showGameMenu();
        }
        System.out.println("Your choice: " + answer);
        switch (answer) {
            case 0 : return;
            case 1 : player = Cli.greeting();
            break;
            case 2 : if (player.isBlank()) {
                    player = Cli.greeting();
                }
                Engine.playTheGame(player, GameType.ODD_OR_EVEN);
            break;
            case 3 : if (player.isBlank()) {
                    player = Cli.greeting();
                }
                Engine.playTheGame(player, GameType.CALC);
                break;
            default: System.out.println("Incorrect input!");
        }
        showGameMenu();
    }
}

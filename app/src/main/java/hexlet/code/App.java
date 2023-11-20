package hexlet.code;

import hexlet.code.games.GameType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static String player = "";
    private static final Object[][] ACTIONS = {
            {1, "Greet"},
            {2, "Even"},
            {3, "Calc"},
            {4, "GCD"},
            {0, "Exit"}
    };
    public static void main(String[] args) {
        showGameMenu();
    }
    public static void showGameMenu() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        System.out.println("Please enter the game number and press Enter.");
        for (var action : ACTIONS) {
            System.out.println(action[0] + " - " + action[1]);
        }
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
            case 4 : if (player.isBlank()) {
                    player = Cli.greeting();
                }
                Engine.playTheGame(player, GameType.GCD);
                break;
            default: System.out.println("Incorrect input!");
        }
        showGameMenu();
    }
}

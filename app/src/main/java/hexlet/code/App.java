package hexlet.code;

import hexlet.code.utils.GameType;
import hexlet.code.utils.Settings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static String player = "";
    private static final Object[][] ACTIONS = {
            {Settings.GREET, "Greet"},
            {Settings.EVEN, "Even"},
            {Settings.CALC, "Calc"},
            {Settings.GCD, "GCD"},
            {Settings.PROGRESSIONS, "Progressions"},
            {Settings.PRIME, "Prime"},
            {Settings.EXIT, "Exit"}
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
            case Settings.EXIT -> {
            }
            case Settings.GREET -> {
                player = Cli.greeting();
            }
            case Settings.EVEN -> {
                player = Cli.greeting();
                Engine.playTheGame(player, GameType.ODD_OR_EVEN);
            }
            case Settings.CALC -> {
                player = Cli.greeting();
                Engine.playTheGame(player, GameType.CALC);
            }
            case Settings.GCD -> {
                player = Cli.greeting();
                Engine.playTheGame(player, GameType.GCD);
            }
            case Settings.PROGRESSIONS -> {
                player = Cli.greeting();
                Engine.playTheGame(player, GameType.PROGRESSIONS);
            }
            case Settings.PRIME -> {
                player = Cli.greeting();
                Engine.playTheGame(player, GameType.PRIME);
            }
            default -> {
                System.out.println("Incorrect input! Try again");
                showGameMenu();
            }
        }
    }
}

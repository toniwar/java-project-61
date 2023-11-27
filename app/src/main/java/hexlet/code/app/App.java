package hexlet.code.app;

import hexlet.code.games.Game;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class App {
    private static final LinkedHashMap<Integer, String> MENU = Menu.getMenu();
    public static void main(String[] args) {
        showGameMenu();
    }
    public static void showGameMenu() {
        Scanner scanner = new Scanner(System.in);
        int answer;
        System.out.println("Please enter the game number and press Enter.");
        MENU.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
        if (scanner.hasNextInt()) {
            answer = scanner.nextInt();
            System.out.println("Your choice: " + answer);
            if (MENU.containsKey(answer)) {
                Game.startGame(answer);
            } else {
                System.out.printf("An action with number '%d' is not in the list.\n", answer);
                showGameMenu();
            }

        } else {
            System.out.println("Incorrect input.");
            showGameMenu();
        }
        scanner.close();
    }
}

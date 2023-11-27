package hexlet.code.app;

import hexlet.code.games.Game;
import java.util.LinkedHashMap;
import java.util.Map;
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
            if (!compareKeys(answer, MENU)) {
                System.out.printf("An action with number '%d' is not in the list.\n", answer);
                showGameMenu();
            } else {
                Game.startGame(answer);
            }

        } else {
            System.out.println("Incorrect input.");
            showGameMenu();
        }
        scanner.close();
    }

    private static boolean compareKeys(int value, Map<Integer, String> map) {
        for (var key : map.keySet()) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}

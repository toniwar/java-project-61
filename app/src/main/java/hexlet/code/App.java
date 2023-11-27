package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int QUESTIONS_NUMBER = 3;
    private static final String[] MENU = {
        "1 - Greet",
        "2 - Even",
        "3 - Calc",
        "4 - GCD",
        "5 - Progressions",
        "6 - Prime",
        "0 - Exit"
    };

    public static void main(String[] args) {
        for (var item: MENU) {
            System.out.println(item);
        }
        Scanner scanner = new Scanner(System.in);
        var selectedItem = scanner.next();
        System.out.println("Your choice: " + selectedItem);
        switch (selectedItem) {
            case "1" -> Cli.greet();
            case "2" -> Even.runGame(QUESTIONS_NUMBER);
            case "3" -> Calc.runGame(QUESTIONS_NUMBER);
            case "4" -> GCD.runGame(QUESTIONS_NUMBER);
            case "5" -> Progression.runGame(QUESTIONS_NUMBER);
            case "6" -> Prime.runGame(QUESTIONS_NUMBER);
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid number entered!");
        }
    }
}

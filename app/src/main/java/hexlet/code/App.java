package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progressions;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progressions");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        var selectedItem = scanner.next();
        System.out.println("Your choice: " + selectedItem);
        switch (selectedItem) {
            case "1" -> Cli.greet();
            case "2" -> Even.runGame();
            case "3" -> Calc.runGame();
            case "4" -> GCD.runGame();
            case "5" -> Progressions.runGame();
            case "6" -> Prime.runGame();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid number entered!");
        }
    }
}

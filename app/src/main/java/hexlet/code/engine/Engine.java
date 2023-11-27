package hexlet.code.engine;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Engine {
    public static void launch(String description, Map<String, String> questions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String player;
        while (true) {
            player = fillInTheName(scanner);
            if (!player.isBlank()) {
                System.out.printf("Hello, %s!\n", player);
                break;
            }
            System.out.println("The name cannot be empty. Please, enter Your name.");
        }
        startGame(scanner, player, description, questions);
        scanner.close();
    }

    private static String fillInTheName(Scanner scanner) {
        String name;
        try {
            name = scanner.nextLine();
        } catch (NoSuchElementException e) {
            name = "";
        }
        return name;
    }

    private static void startGame(Scanner scanner, String player, String description, Map<String, String> questions) {
        System.out.println(description);
        for (var entry : questions.entrySet()) {
            System.out.println("Question: " + entry.getKey());
            var answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            var rightAnswer = entry.getValue();
            if (!answer.equalsIgnoreCase(rightAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n"
                        + "Let's try again, %s!", answer, rightAnswer, player);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!", player);
    }
}

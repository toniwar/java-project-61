package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;

    public static void launch(String description, Map<String, String> questions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        var player = scanner.next();
        System.out.printf("Hello, %s!\n", player);
        System.out.println(description);
        for (var entry : questions.entrySet()) {
            System.out.println("Question: " + entry.getKey());
            var answer = scanner.next();
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
        scanner.close();
    }
}

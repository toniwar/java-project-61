package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void oddOrEven(String player) {
        int number;
        String rightAnswer;
        String answer;
        var scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            number = new Random().nextInt(1, 101);
            rightAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + number);
            answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (!answer.equalsIgnoreCase(rightAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s\n",
                        answer, rightAnswer, player);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", player);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.List;

public final class GCD {
    private static final int ROUNDS = 3;
    private static final int MAX_NUM = 100;
    private static final int MIN_NUM = 2;
    private static final int[] DIVISORS = {2, 3, 5};
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < ROUNDS; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }

    private static List<String> generateQuestion() {
        var num1 = generateRandomNum();
        var num2 = generateRandomNum();
        var rightAnswer = gcd(num1, num2);
        var question = num1 + " " + num2;
        return List.of(question, Integer.toString(rightAnswer));
    }

    private static int generateRandomNum() {
        while (true) {
            var num = Utils.generateNumber(MIN_NUM, MAX_NUM);
            if (num % DIVISORS[0] == 0
                    || num % DIVISORS[1] == 0
                    || num % DIVISORS[2] == 0) {
                return num;
            }
        }
    }
    private static int gcd(int num1, int num2) {

        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
}

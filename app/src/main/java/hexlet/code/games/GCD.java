package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.List;

public final class GCD {

    private static final int MAX_NUM = 60;
    private static final int MIN_NUM = 1;
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }

    private static List<String> generateQuestion() {
        var num1 = Utils.generateNumber(MIN_NUM, MAX_NUM);
        var num2 = Utils.generateNumber(MIN_NUM, MAX_NUM);
        var rightAnswer = gcd(num1, num2);
        var question = num1 + " " + num2;
        return List.of(question, Integer.toString(rightAnswer));
    }

    private static int gcd(int num1, int num2) {
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
}

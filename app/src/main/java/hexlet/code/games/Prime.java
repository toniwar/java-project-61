package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.List;

public final class Prime {

    private static final int MAX_NUM = 300;
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }

    private static List<String> generateQuestion() {
        var num = Utils.generateNumber(MAX_NUM);
        var rightAnswer = isPrime(num) ? "yes" : "no";
        var question = "" + num;
        return List.of(question, rightAnswer);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (var i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

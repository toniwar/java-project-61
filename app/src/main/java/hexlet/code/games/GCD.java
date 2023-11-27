package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class GCD {
    private static final int MAX_X = 101;
    private static final int MAX_Y = 51;
    private static final int MIN_NUM = 2;
    private static final int[] DIVISORS = new int[]{2, 3, 5};

    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static HashMap<String, String> getQuestions(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        return questions;
    }
    private static List<String> generateQuestion() {
        var rightAnswer = "";
        var x = generateRandomNum(MAX_X);
        var y = generateRandomNum(MAX_Y);
        var maxNum = Math.max(x, y);
        for (var i = maxNum; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                rightAnswer = "" + i;
                break;
            }
        }
        var question = x + " " + y;
        return List.of(question, rightAnswer);
    }

    private static int generateRandomNum(int limit) {
        var random = new Random();
        while (true) {
            var num = random.nextInt(MIN_NUM, limit);
            if (num % DIVISORS[0] == 0
                    || num % DIVISORS[1] == 0
                    || num % DIVISORS[2] == 0) {
                return num;
            }
        }
    }
}

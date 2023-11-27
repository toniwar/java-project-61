package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class Prime {
    private static final int MAX_NUM = 301;
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static HashMap<String, String> getQuestions(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        return questions;
    }
    private static List<String> generateQuestion() {
        var num = new Random().nextInt(MAX_NUM);
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

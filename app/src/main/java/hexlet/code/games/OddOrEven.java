package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class OddOrEven {
    private static final int MAX_NUM = 101;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static HashMap<String, String> getQuestions(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        return questions;
    }
    private static List<String> generateQuestion() {
        var number = new Random().nextInt(MAX_NUM);
        var question = "" + number;
        var rightAnswer = number % 2 == 0 ? "yes" : "no";
        return List.of(question, rightAnswer);
    }

}

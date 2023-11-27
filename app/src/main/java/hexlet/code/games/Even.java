package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.HashMap;
import java.util.List;

public final class Even {
    private static final int MAX_NUM = 100;
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }

    private static List<String> generateQuestion() {
        var number = Utils.generateNumber(MAX_NUM);
        var question = "" + number;
        var rightAnswer = number % 2 == 0 ? "yes" : "no";
        return List.of(question, rightAnswer);
    }
}

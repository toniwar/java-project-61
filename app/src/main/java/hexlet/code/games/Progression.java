package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.List;

public final class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_STEP = 2;
    private static final int MAX_STEP = 15;
    private static final int MAX_FIRST_ELEMENT = 42;
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static void runGame(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }
    private static List<String> generateQuestion() {
        var progressionLength = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
        var x = Utils.generateNumber(2, progressionLength - 1);
        var step = Utils.generateNumber(MIN_STEP, MAX_STEP);
        var firstElement = Utils.generateNumber(MAX_FIRST_ELEMENT);
        var progression = makeProgression(firstElement, step, progressionLength);
        var rightAnswer = progression[x];
        progression[x] = "..";
        var question = String.join(" ", progression);
        return List.of(question, rightAnswer);
    }

    private static String[] makeProgression(int first, int step, int length) {
        var progression = new String[length];
        var current = first;
        for (var i = 0; i < length; i++) {
            progression[i] = "" + current;
            current += step;
        }
        return progression;
    }
}

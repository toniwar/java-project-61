package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 11;
    private static final int MIN_STEP = 2;
    private static final int MAX_STEP = 16;
    private static final int MAX_FIRST_ELEMENT = 42;
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static HashMap<String, String> getQuestions(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        return questions;
    }
    private static List<String> generateQuestion() {
        var random = new Random();
        var progressionLength = random.nextInt(MIN_LENGTH, MAX_LENGTH);
        var x = random.nextInt(2, progressionLength);
        var step = random.nextInt(MIN_STEP, MAX_STEP);
        var firstElement = random.nextInt(MAX_FIRST_ELEMENT);
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

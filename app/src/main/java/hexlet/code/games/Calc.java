package hexlet.code.games;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class Calc {
    private static final int MAX_NUM = 30;
    private static final int ADDITION = 0;
    private static final int SUBTRACTION = 1;
    private static final int MULTIPLICATION = 2;
    public static final int OPERATIONS_COUNT = 3;
    public static final String DESCRIPTION = "What is the result of the expression?";
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
        var x = random.nextInt(MAX_NUM);
        var y = random.nextInt(MAX_NUM);
        var operation = random.nextInt(OPERATIONS_COUNT);
        return switch (operation) {
            case ADDITION -> calcOperation(x, y, '+');
            case SUBTRACTION -> calcOperation(x, y, '-');
            case MULTIPLICATION -> calcOperation(x, y, '*');
            default -> List.of(null, null);
        };
    }
    private static List<String> calcOperation(int x, int y, char operation) {
        var result  = switch (operation) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            default -> throw new RuntimeException("Unknown operation: " + operation);
        };

        var rightAnswer = "" + result;
        var question = String.format("%d %s %d", x, operation, y);
        return List.of(question, rightAnswer);
    }
}

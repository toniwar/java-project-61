package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.HashMap;
import java.util.List;

public final class Calc {
    private static final int MAX_NUM = 30;
    private static final int ADDITION = 0;
    private static final int SUBTRACTION = 1;
    private static final int MULTIPLICATION = 2;
    public static final int OPERATIONS_COUNT = 2;
    public static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame(int questionsNumber) {
        var questions = new HashMap<String, String>();
        for (var i = 0; i < questionsNumber; i++) {
            var question = generateQuestion();
            questions.put(question.get(0), question.get(1));
        }
        Engine.launch(DESCRIPTION, questions);
    }
    private static List<String> generateQuestion() {
        var x = Utils.generateNumber(MAX_NUM);
        var y = Utils.generateNumber(MAX_NUM);
        var operationNum = Utils.generateNumber(OPERATIONS_COUNT);
        var operation = switch (operationNum) {
            case ADDITION -> '+';
            case SUBTRACTION -> '-';
            case MULTIPLICATION -> '*';
            default -> throw new  RuntimeException("Unknown operation number: " + operationNum);
        };
        var rightAnswer = "" + calc(x, y, operation);
        var question = String.format("%d %s %d", x, operation, y);
        return List.of(question, rightAnswer);
    }
    private static int calc(int x, int y, char operation) {
        return switch (operation) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            default -> throw new RuntimeException("Unknown operation: " + operation);
        };
    }
}

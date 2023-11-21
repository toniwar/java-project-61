package hexlet.code.games;

import hexlet.code.games.repository.Game;
import hexlet.code.utils.Settings;

import java.util.Random;

public class Calc implements Game {
    private String rightAnswer;
    @Override
    public String showGameRule() {
        return "What is the result of the expression?";
    }

    @Override
    public String generateQuestion() {
        var random = new Random();
        var x = random.nextInt(Settings.MAX_CALC_NUM);
        var y = random.nextInt(Settings.MAX_CALC_NUM);
        var operation = random.nextInt(Settings.OPERATIONS_COUNT);
        return switch (operation) {
            case Settings.ADDITION -> addition(x, y);
            case Settings.SUBTRACTION -> subtraction(x, y);
            case Settings.MULTIPLICATION -> multiplication(x, y);
            default -> "";
        };
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(rightAnswer);
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }

    private String addition(int x, int y) {
        rightAnswer = "" + (x + y);
        return String.format("%d + %d", x, y);
    }

    private String subtraction(int x, int y) {
        rightAnswer = "" + (x - y);
        return String.format("%d - %d", x, y);
    }

    private String multiplication(int x, int y) {
        rightAnswer = "" + (x * y);
        return String.format("%d * %d", x, y);
    }
}

package hexlet.code.games;

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
        var x = random.nextInt(100);
        var y = random.nextInt(100);
        var operation = random.nextInt(1, 4);
        return switch (operation) {
            case 1 -> addition(x, y);
            case 2 -> subtraction(x, y);
            default -> multiplication(x, y);
        };
    }

    @Override
    public boolean giveAnswer(String answer) {
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
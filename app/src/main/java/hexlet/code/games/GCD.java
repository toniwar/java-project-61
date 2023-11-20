package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private String rightAnswer;
    @Override
    public String showGameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String generateQuestion() {
        var x = generateEvenRandomNum(101);
        var y = generateEvenRandomNum(51);
        var maxNum = Math.max(x, y);
        for (var i = maxNum; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                rightAnswer = "" + i;
                break;
            }
        }
        return x + " " + y;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(rightAnswer);
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }

    private int generateEvenRandomNum(int limit) {
        var random = new Random();
        while (true) {
            var num = random.nextInt(limit);
            if (num % 2 == 0) {
                return num;
            }
        }
    }
}

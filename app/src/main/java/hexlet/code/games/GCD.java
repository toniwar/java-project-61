package hexlet.code.games;

import hexlet.code.games.repository.Game;
import hexlet.code.utils.Settings;

import java.util.Random;

public final class GCD implements Game {
    private String rightAnswer;
    @Override
    public String showGameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String generateQuestion() {
        var x = generateRandomNum(Settings.GCD_MAX_X);
        var y = generateRandomNum(Settings.GCD_MAX_Y);
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

    private int generateRandomNum(int limit) {
        var random = new Random();
        while (true) {
            var num = random.nextInt(Settings.GCD_MIN_NUM, limit);
            if (num % Settings.GCD_DIVISORS[0] == 0
                    || num % Settings.GCD_DIVISORS[1] == 0
                    || num % Settings.GCD_DIVISORS[2] == 0) {
                return num;
            }
        }
    }
}

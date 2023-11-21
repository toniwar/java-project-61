package hexlet.code.games;

import hexlet.code.games.repository.Game;
import hexlet.code.utils.Settings;

import java.util.Random;

public final class Prime implements Game {
    private String rightAnswer;

    @Override
    public String showGameRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String generateQuestion() {
        var num = new Random().nextInt(Settings.MAX_PRIME_NUM);
        rightAnswer = isPrime(num) ? "yes" : "no";
        return "" + num;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(rightAnswer);
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (var i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

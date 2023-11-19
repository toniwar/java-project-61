package hexlet.code.games;

import java.util.Random;

public class OddOrEven implements Game {
    private String rightAnswer;
    @Override
    public String showGameRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String generateQuestion() {
        var number = new Random().nextInt(1, 101);
        rightAnswer = number % 2 == 0 ? "yes" : "no";
        return "" + number;
    }

    @Override
    public boolean giveAnswer(String answer) {
        return answer.equalsIgnoreCase(rightAnswer);
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }
}

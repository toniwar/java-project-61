package hexlet.code.games;

import hexlet.code.games.repository.Game;

import java.util.Random;

public class Progression implements Game {
    private String rightAnswer;

    @Override
    public String showGameRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public String generateQuestion() {
        var question = new StringBuilder();
        var random = new Random();
        var progressionLength = random.nextInt(5, 11);
        var x = random.nextInt(2, progressionLength);
        var increment = random.nextInt(2, 16);
        var initialElement = random.nextInt(0, 21);
        for (int i = initialElement, k = 0; k < progressionLength; i += increment, k++) {
            if (k != x) {
                var element = i + " ";
                question.append(element);
            } else {
                rightAnswer = "" + i;
                question.append(".. ");
            }
        }
        return question.toString();
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals(rightAnswer);
    }

    @Override
    public String getRightAnswer() {
        return rightAnswer;
    }
}

package hexlet.code.games;

import hexlet.code.games.repository.Game;
import hexlet.code.utils.Settings;

import java.util.Random;

public final class Progression implements Game {
    private String rightAnswer;

    @Override
    public String showGameRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public String generateQuestion() {
        var question = new StringBuilder();
        var random = new Random();
        var progressionLength = random.nextInt(Settings.MIN_PROGRESSION_LENGTH, Settings.MAX_PROGRESSION_LENGTH);
        var x = random.nextInt(2, progressionLength);
        var increment = random.nextInt(Settings.MIN_PROGRESSION_INCREMENT, Settings.MAX_PROGRESSION_INCREMENT);
        var initialElement = random.nextInt(Settings.MAX_INITIAL_PROGRESSION_ELEMENT);
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

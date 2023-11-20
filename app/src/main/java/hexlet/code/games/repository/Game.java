package hexlet.code.games;

public interface Game {
    String showGameRule();
    String generateQuestion();
    boolean checkAnswer(String answer);
    String getRightAnswer();
}

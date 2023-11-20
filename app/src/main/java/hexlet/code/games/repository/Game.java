package hexlet.code.games.repository;

public interface Game {
    String showGameRule();
    String generateQuestion();
    boolean checkAnswer(String answer);
    String getRightAnswer();
}

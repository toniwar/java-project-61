package hexlet.code.games;

public interface Game {
    String showGameRule();
    String generateQuestion();
    boolean giveAnswer(String answer);
    String getRightAnswer();
}

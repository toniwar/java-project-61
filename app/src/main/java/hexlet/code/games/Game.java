package hexlet.code.games;

import hexlet.code.cli.Cli;
import hexlet.code.engine.Engine;

public class Game {
    private static final int DEFAULT_QUESTIONS_COUNT = 3;
    public static void startGame(int key) {
        if (key == GameKeys.EXIT) {
            return;
        }
        if (key == GameKeys.GREET) {
            Cli.greeting();
            return;
        }
        String description = "";
        int questionsCount = DEFAULT_QUESTIONS_COUNT;
        switch (key) {
            case GameKeys.EVEN -> {
                description = OddOrEven.DESCRIPTION;
                Engine.launch(description, OddOrEven.getQuestions(questionsCount));
            }
            case GameKeys.CALC -> {
                description = Calc.DESCRIPTION;
                Engine.launch(description, Calc.getQuestions(questionsCount));
            }
            case GameKeys.GCD -> {
                description = GCD.DESCRIPTION;
                Engine.launch(description, GCD.getQuestions(questionsCount));
            }
            case GameKeys.PROGRESSION -> {
                description = Progression.DESCRIPTION;
                Engine.launch(description, Progression.getQuestions(questionsCount));
            }
            case GameKeys.PRIME -> {
                description = Prime.DESCRIPTION;
                Engine.launch(description, Prime.getQuestions(questionsCount));
            }
            default -> throw new RuntimeException("Unknown key: " + key);
        }
    }
}

package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.repository.Game;
import hexlet.code.utils.GameType;
import hexlet.code.games.OddOrEven;
import hexlet.code.games.Progression;


public class Engine {
    private static final int DEFAULT_ROUNDS = 3;
    public static void playTheGame(String player, GameType gameType) {
        playTheGame(player, gameType, DEFAULT_ROUNDS);
    }
    public static void playTheGame(String player, GameType gameType, int rounds) {
        Game game;
        switch (gameType) {
            case ODD_OR_EVEN: game = new OddOrEven();
            break;
            case CALC: game = new Calc();
            break;
            case GCD: game = new GCD();
            break;
            case PROGRESSIONS: game = new Progression();
            break;
            default: return;
        }
        System.out.println(game.showGameRule());
        String answer;
        var scanner = new Scanner(System.in);
        for (var i = 0; i < rounds; i++) {
            System.out.println("Question: " + game.generateQuestion());
            answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if (!game.checkAnswer(answer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s\n",
                        answer, game.getRightAnswer(), player);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", player);
    }
}

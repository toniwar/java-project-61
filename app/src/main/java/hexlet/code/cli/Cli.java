package hexlet.code.cli;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String player;
        while (true) {
            player = fillInTheName(scanner);
            if (!player.isBlank()) {
                System.out.printf("Hello, %s!\n", player);
                break;
            }
            System.out.println("The name cannot be empty. Please, enter Your name.");
        }
        scanner.close();
    }

    private static String fillInTheName(Scanner scanner) {
        var name = "";
        try {
            name = scanner.nextLine();
        } catch (NoSuchElementException e) {
            name = "";
        }
        return name;
    }
}

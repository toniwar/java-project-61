package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String player;
        while (true) {
            player = scanner.nextLine();
            if (!player.isBlank()) {
                System.out.printf("Hello, %s!\n", player);
                break;
            }
            System.out.println("The name cannot be empty. Please, enter Your name.");
        }
        scanner.close();
    }

}

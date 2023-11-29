package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        var player = scanner.next();
        System.out.printf("Hello, %s!\n", player);
        scanner.close();
    }

}

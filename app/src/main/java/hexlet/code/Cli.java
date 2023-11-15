package hexlet.code;

import java.util.Scanner;

public class Cli {
    final static String GREETING = "Welcome to the Brain Games!\nMay I have You name?";
    public static void greeting() {
        var scanner = new Scanner(System.in);
        System.out.println(GREETING);
        var userName = scanner.nextLine();
        System.out.printf("Hello, %s!\n", userName);
    }
}

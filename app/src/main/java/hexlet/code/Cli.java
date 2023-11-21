package hexlet.code;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cli {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have You name?");
        String name;
        while (true) {
            name = fillInTheName();
            if (!name.isBlank()) {
                break;
            }
            System.out.println("The name cannot be empty. Please, enter Your name.");
        }
        System.out.printf("Hello, %s!\n", name);
        return name;
    }
    private static String fillInTheName() {
        var scanner = new Scanner(System.in);
        String name;
        try {
            name = scanner.nextLine();
        } catch (NoSuchElementException e) {
            name = "";
        }
        return name;
    }
}

package hexlet.code.utils;

public class Settings {
    //Menu constants
    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSIONS = 5;
    public static final int PRIME = 6;

    //Odd or Even constants
    public static final int MAX_ODD_OR_EVEN_NUM = 101;

    //Calc constants
    public static final int MAX_CALC_NUM = 30;
    public static final int ADDITION = 0;
    public static final int SUBTRACTION = 1;
    public static final int MULTIPLICATION = 2;
    public static final int OPERATIONS_COUNT = 3;

    //GCD constants
    public static final int GCD_MAX_X = 101;
    public static final int GCD_MAX_Y = 51;
    public static final int GCD_MIN_NUM = 2;
    /**
     * Divisors for more successful generation of a pair
     * of numbers with GCD.
     * */
    public static final int[] GCD_DIVISORS = new int[]{2, 3, 5};

    //Prime constants
    public static final int MAX_PRIME_NUM = 301;

    //Progression constants
    public static final int MIN_PROGRESSION_LENGTH = 5;
    public static final int MAX_PROGRESSION_LENGTH = 11;
    public static final int MIN_PROGRESSION_INCREMENT = 2;
    public static final int MAX_PROGRESSION_INCREMENT = 16;
    public static final int MAX_INITIAL_PROGRESSION_ELEMENT = 21;
}

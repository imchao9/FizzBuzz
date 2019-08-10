/**
 * FizzBuzz
 * <p>
 * Created at: 2019/8/10
 *
 * @author chao
 */
public class FizzBuzz {

    public static String fizzbuzz(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        if ((number % 3 == 0) || isContains(number, 3)) return "Fizz";
        if (number % 5 == 0 || isContains(number, 5)) return "Buzz";
        return String.valueOf(number);
    }

    public static boolean isContains(int number, int containNum) {
        return String.valueOf(number).contains(String.valueOf(containNum));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzzTest
 * <p>
 * Created at: 2019/8/10
 *
 * @author chao
 */
public class FizzBuzzTest {
    @Test
    public void returnNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }

    @Test
    public void replaceToFizzIfTheNumberIsDividedBy3OrContain3() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(13));
    }

    @Test
    public void replaceToBuzzIfTheNumberIsDividedBy5OrContain5() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(52));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(51));
    }

    @Test
    public void replaceToBuzzIfTheNumberIsDividedBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }
}

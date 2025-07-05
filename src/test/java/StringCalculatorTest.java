import org.incubyte.StringCalculator;   
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class StringCalculatorTest {
   StringCalculator calculator = new StringCalculator();

   @Test
    void shouldReturnNumberForSingleInput() {
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void shouldReturnSumOfTwoCommaSeparatedNumbers() {
        assertEquals(9, calculator.add("4,5"));
    }

    @Test
    void shouldReturnSumOfMultipleCommaSeparatedNumbers() {
        assertEquals(10, calculator.add("1,2,3,4"));
    }

    @Test
    void shouldHandleNewLineAsDelimiter() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

}

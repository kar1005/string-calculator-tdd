import org.incubyte.StringCalculator;   
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    void shouldSupportCustomDelimiterSyntax() {
        assertEquals(7, calculator.add("//%\n5%2"));
    }

    @Test
    void shouldThrowExceptionForNegativeNumbers() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("1,-2,-3");
        });
        assertEquals("negative numbers not allowed: -2,-3", e.getMessage());
    }


}

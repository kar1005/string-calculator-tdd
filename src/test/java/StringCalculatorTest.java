import org.incubyte.StringCalculator;   
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
class StringCalculatorTest {
   StringCalculator calculator = new StringCalculator();

   @Test
    void shouldReturnNumberForSingleInput() {
        assertEquals(5, calculator.add("5"));
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    SumCalculator sumCalculator;
    @BeforeEach
    public void createAnObject(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testThatSumOf1WorksOk(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumOf3WorksOk(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumOf0WorksOk(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0) );
    }
}

package task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddDoesNotAcceptChar() {
        Calculator calculator = new Calculator();
        try {
            char invalidChar = 'a';
            int result = calculator.add(2, invalidChar);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Division by zero is not allowed.");
        }
    }

    @Test
    void add() {
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(5, 3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(5, 3);
        assertThat(result).isEqualTo(15);
    }

    @Test
    void divide() {
        int result = calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
    }
}
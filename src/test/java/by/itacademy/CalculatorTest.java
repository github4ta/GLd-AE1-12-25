package by.itacademy;

import org.junit.jupiter.api.Test;

=======
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double actual = calculator.subtract(3.0, 1.0);

        assertEquals(2, actual);

    }
}


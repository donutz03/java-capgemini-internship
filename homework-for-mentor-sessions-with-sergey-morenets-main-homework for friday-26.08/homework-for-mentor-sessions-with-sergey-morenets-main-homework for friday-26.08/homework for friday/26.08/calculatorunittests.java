package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void thousandPlusTenThousandGivesElevenThousand() {
        int sumResult = calculator.sum(1000, 10000);
        assertEquals(sumResult, 11000);
    }

    @Test
    void thousandTimesTenThousandGivesTenMillion() {
        int productResult = calculator.product(1000, 10000);
        assertEquals(productResult, 10000000);
    }

    @Test
    void thousandDividedByTenThousandGivesZeroPointOne() {
        int DivisionResult = calculator.division(1000, 10000);
        assertEquals(divisionResult, 0.1);
    }

    @Test
    void thousandMinusTenThousandGivesMinusNineThousand() {
        int subtractionResult = calculator.subtraction(1000, 10000);
        assertEquals(divisionResult, -9000);
    }
}

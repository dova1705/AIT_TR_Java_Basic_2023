package hw_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareEquationTest {
    //поля
    SquareEquation squareEquation;

    @BeforeEach
    void setUp() {
        squareEquation = new SquareEquation();
    }

    @Test
    void equationQuadraticRoot1Test() {
        Double a = 1.0;
        Double b = - 5.0;
        Double c = 6.0;
        assertEquals(2, squareEquation.equationQuadraticRoot1(a, b, c));
    }

    @Test
    void equationQuadraticRoot2Test() {
        Double a = 1.0;
        Double b = - 5.0;
        Double c = 6.0;
        assertEquals(3, squareEquation.equationQuadraticRoot2(a,b,c));
    }
}
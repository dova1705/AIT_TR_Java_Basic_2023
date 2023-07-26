package hw_29.shape.tests;

import hw_29.shape.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(5);
    }

    @Test
    void calcPerimeter() {
        assertEquals(20, square.calcPerimeter(5));
    }

    @Test
    void calcArea() {
        assertEquals(25, square.calcArea(5));
    }
}
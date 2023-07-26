package hw_29.shape.tests;

import hw_29.shape.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(4);
    }

    @Test
    void calcArea() {
        assertEquals(16, rectangle.calcArea(4));
    }

    @Test
    void calcPerimeter() {
        assertEquals(20, rectangle.calcPerimeter(5));
    }
}
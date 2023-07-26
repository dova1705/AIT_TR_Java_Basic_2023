package hw_29.shape.tests;

import hw_29.shape.Circle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(5);
    }

    @Test
    void calcArea() {
        assertEquals(78.5, circle.calcArea(5));
    }

    @Test
    void calcPerimeter() {
        assertEquals(31.4, circle.calcPerimeter(5));
    }
}
package hw_29.shape.tests;

import hw_29.shape.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(5);
    }

    @Test
    void calcArea() {
        assertEquals(10., triangle.calcArea(5));
    }

    @Test
    void calcPerimeter() {
        assertEquals(15, triangle.calcPerimeter(5));
    }
}
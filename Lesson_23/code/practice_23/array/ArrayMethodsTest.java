package practice_23.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    void sumElOfArrayTest() {
        int[] num = {10, 20, 40, 50, 30};
        assertEquals(150, arrayMethods.sumElOfArray(num));
    }

    @Test
    void sumElOfOddIndexTest() {
        int[] num = {10, 20, 40, 50, 30};
        assertEquals(70, arrayMethods.sumElOfOddIndex(num));
    }
}
package hw_23.arr_random_num;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrOfRandomNumTest {

    ArrOfRandomNum arrOfRandomNum;//определяем поле с типом в тестируемого класса ArrOfRandomNum и создаем объект arrOfRandomNum такого типа

    @BeforeEach
    void setUp() {
        arrOfRandomNum = new ArrOfRandomNum();//создали объект arrOfRandomNum класса ArrOfRandomNum
    }

    @Test
    void positiveNumbersTest() {
        int[] num = {10, -20, 40, 50, -30};
        assertEquals(3, arrOfRandomNum.positiveNumbers(num));
    }

    @Test
    void evenNumTest() {
        int[] num = {10, -20, 40, 5, -3};
        assertEquals(3, arrOfRandomNum.evenNum(num));
    }

    @Test
    void negativeNumTest() {
        int[] num = {10, -20, 40, 5, -3};
        assertEquals(2,arrOfRandomNum.negativeNum(num));
    }

    @Test
    void zeroTest() {
        int[] num = {10, 0, 40, 5, 0};
        assertEquals(2,arrOfRandomNum.zero(num));
    }
}
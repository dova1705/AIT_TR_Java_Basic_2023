package pracrice_30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateArrayTest {
    DuplicateArray duplicateArray;

    @BeforeEach
    void setUp() {
        duplicateArray = new DuplicateArray();
    }

    @Test
    void displayDuplicatesTest() {
        //создаем массив с числами дубликатами внутри
        int[] arr = {5,4,5,3,2};
        //вызываем метод из тестируемого класса
        //int res = duplicateArray.displayDuplicates(arr, 5);
        //проверяем результат
        assertEquals(2, duplicateArray.displayDuplicates(arr, 5));
    }
}
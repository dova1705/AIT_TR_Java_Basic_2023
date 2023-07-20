package hw_23.is_prime_num;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeNumTest {
    //поля (тип и имя)
    IsPrimeNum isPrimeNum;

    @BeforeEach
    void setUp() {
        isPrimeNum = new IsPrimeNum();
    }

    @Test
    void primeNTest() {
        boolean primeNumber = isPrimeNum.primeN(7);//переменная boolean присвоил проверяемый метод
        assertTrue(primeNumber);//проверка если число простое зелёный если нет красный
    }
}
package hw_23.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    //поля
    User user;

    @BeforeEach
    void setUp() {
        user = new User("","");
    }

    @Test
    void setEmailTest() {
        String str = "username@mail.ru";
        //assertTrue(user.setEmail();


    }

    @Test
    void setPasswordTest() {
    }
}

/*
@Test
    void primeNTest() {
        boolean primeNumber = isPrimeNum.primeN(7);//переменная boolean присвоил проверяемый метод
        assertTrue(primeNumber);//проверка если число простое зелёный если нет красный
    }
 */
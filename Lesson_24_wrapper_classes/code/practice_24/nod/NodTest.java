package practice_24.nod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodTest {
    Nod nod;

    @BeforeEach
    void setUp() {
        nod = new Nod();
    }

    @Test
    void nodTest() {
        int a = 18;
        int b = 24;
        assertEquals(6,nod.nod(a, b));
    }
}
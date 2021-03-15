package training360;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add() {
        assertEquals(10, new calculator().add(7,3));

    }
}
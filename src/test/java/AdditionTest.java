package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {
    private final Calculator calculator = new Calculator();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void passedAddition() throws Exception {
        assertEquals(2, calculator.calculate("addition",1, 1));
    }
    @Test
    void failedAddition() throws Exception {
        assertNotEquals(33, calculator.calculate("addition",1, 1));
    }
}
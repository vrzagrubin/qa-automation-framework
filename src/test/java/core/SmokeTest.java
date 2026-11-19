package core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmokeTest {

    @Test
    @DisplayName("Окружение живо: Java и JUnit 5 работают")
    void environmentIsAlive() {
        assertEquals(2, 1 + 1, "Базовая арифметика должна работать");
    }
}

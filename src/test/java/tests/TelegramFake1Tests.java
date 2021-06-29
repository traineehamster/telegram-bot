package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fake")
public class TelegramFake1Tests {

    @Test
    @Disabled("To show how disabled tests looks in allure-report")
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Disabled("To show how disabled tests looks in allure-report")
    void some1Test() {
        assertTrue(false);
    }

    @Test
    @Disabled("To show how disabled tests looks in allure-report")
    void some2Test() {
        assertTrue(false);
    }
}

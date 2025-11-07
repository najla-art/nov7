package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testGetMessage() {
        String expected = "✅ Hello from Maven + GitHub Actions!";
        String actual = App.getMessage();
        assertEquals(expected, actual, "Message should match expected text");
    }
}

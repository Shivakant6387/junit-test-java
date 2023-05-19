package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("A special test case")
public class DisplayNameDemo {
    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
        int result = 2 - 6;
        assertEquals(-4, result, "Expected result is 4");
    }
    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpacesMethod() {
        int result = 2 * 9;
        assertNotEquals(17, result, "Expected result is 4");
    }
    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
        int result=2+2;
        assertEquals(4, result, "Expected result is 4");
    }
    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharactersMethod() {
        int result=2+2;
        assertNotEquals(6, result, "Expected result is 4");
    }
    @Test
    @DisplayName("ὣ")
    void testWithDisplayNameContainingEmoji() {
        String str = "Hello, World!";
        assertEquals("Hello, World!", str, "Expected string is 'Hello, World!'");
    }
    @Test
    @DisplayName("ὣ")
    void testWithDisplayNameContainingEmojiMethod() {
        String str = "Hello, World!";
        assertNotEquals("Hello World!", str, "Expected string is 'Hello, World!'");
    }
}

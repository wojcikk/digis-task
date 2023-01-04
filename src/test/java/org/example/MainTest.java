package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isAnagramTestForCorrectAnagrams() {
        assertTrue(Main.isAnagram("study", "dusty"));
    }

    @Test
    void isAnagramTestForCorrectAnagramsWithSpaces() {
        assertTrue(Main.isAnagram("a gentleman", "elegant man"));
    }

    @Test
    void isAnagramTestForCaseInsensitive() {
        assertTrue(Main.isAnagram("thing", "nighT"));
    }

    @Test
    void isAnagramTestForIncorrectAnagrams() {
        assertFalse(Main.isAnagram("decimal point", "dot in place"));
    }

    @Test
    void isAnagramTestForDifferentLengthInputs() {
        assertFalse(Main.isAnagram("dessert", "stressed"));
    }

    @Test
    void isAnagramTestForSpaceSensitive() {
        assertFalse(Main.isAnagram("act ", "cat"));
    }
}

